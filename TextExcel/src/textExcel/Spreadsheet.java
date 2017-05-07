package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid  
{
	int row;
	int cols;
	//Cell [][] spreadsheet = new Cell[20][12];
	private Cell[][] spreadsheet;
	public Spreadsheet(){
		//Cell[][] spreadsheet = new Cell[20][12];
		this.row= getRows();
		this.cols= getCols();
		spreadsheet= new Cell[20][12];
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 12; j++) {
				spreadsheet[i][j] =  new EmptyCell();
			}
		}
		
	}
	
	@Override
	public String processCommand(String command) {
		
		//returns nothing if no value is entered 
		String [] arr1= command.split(" ");
	    if (command.equals("")){
	    	return "";
	    }
	    
	    //clears the entire grid and returns it 
		if (command.equalsIgnoreCase("clear")){
		    clear();
		    return getGridText();
		//returns the contents of one specific cell 
		} else if (!command.equalsIgnoreCase("clear") && arr1.length==1) {
			SpreadsheetLocation location= new SpreadsheetLocation(command);
			return getCell(location).fullCellText(); 
			//clears one specific cell and returns the entire grid
		} else if (((arr1[1].length() <=3) && (arr1[1].length() > 0)) && (arr1[0].equalsIgnoreCase("clear"))){
				SpreadsheetLocation location= new SpreadsheetLocation(arr1[1]);
				clearCell(location);
				return getGridText();
		//sets the contents of a cell and returns the entire grid 
		
		} else if (arr1[1].equals("=") && arr1[2].substring(0,1).equals("\"")){
			SpreadsheetLocation location= new SpreadsheetLocation(arr1[0]);
			row=location.getRow();
			cols=location.getCol();
			String input= command.substring(command.indexOf("\""),command.length());
			input= input.substring(1, input.length()-1);
			//setCell(location,  new TextCell(input));
			spreadsheet [row][cols]= new TextCell(input);
			return getGridText();
		}else if (arr1[2].contains("%")){
			SpreadsheetLocation location= new SpreadsheetLocation(arr1[0]);
			row=location.getRow();
			cols=location.getCol();
			spreadsheet [row][cols]= new PercentCell(arr1[2]);
			return getGridText();

		} else if (arr1[2].substring(0,1) == "(") {
			SpreadsheetLocation location= new SpreadsheetLocation(arr1[0]);
			row=location.getRow();
			cols=location.getCol();
			spreadsheet [row][cols]= new FormulaCell(arr1[2]);
			return getGridText();

		} else if (!arr1[2].contains("%")){
			SpreadsheetLocation location= new SpreadsheetLocation(arr1[0]);
			row=location.getRow();
			cols=location.getCol();
			spreadsheet [row][cols]= new ValueCell(arr1[2]);
			return getGridText();
		}
		else{
			SpreadsheetLocation location= new SpreadsheetLocation(command);
			return getCell(location).fullCellText(); 
		}
		
//		
//		if (arr1.length ==2 && arr1[0].equalsIgnoreCase("clear")){
//			SpreadsheetLocation location= new SpreadsheetLocation(arr1[1]);
//			clearCell(location);
//			return getGridText();
//		}
		//arr1[1].equals("=")
//		if (arr1.length ==3 ){
//				SpreadsheetLocation location= new SpreadsheetLocation(arr1[0]);
//				String input= arr1[2];
//				String newInput= input.substring(1, input.length()-1);
//				setCell(location,  new TextCell(newInput));
//				return getGridText();
//			
//		}
	
		
	}
	/*
	public String parseCell(String location){
		
		int colNumber = Character.toUpperCase(str.charAt(i)) - 'A';
		
	}
	*/
	
	//clear the contents of the entire cell
	public void clear() {
		Cell [][] spreadsheet1 =  spreadsheet;
		for (int i=0; i<=19;i++){
			for(int j=0; j<=11;j++){
				spreadsheet1[i][j]= new EmptyCell();
			}
		}
		
	}
	//clears the content of a cell 
	public void clearCell(Location loc){
		row=loc.getRow();
		cols= loc.getCol();
		spreadsheet[row][cols]= new EmptyCell();
		
	}
	
	//sets the value of a cell
	public void setCell(Location loc, Cell input){
		row=loc.getRow();
		cols=loc.getCol();
		spreadsheet[row][cols]= input;
	}
	
	//returns the number of rows
	@Override
	public int getRows()
	{
		return 20;
	}

	//returns number of columns 
	@Override
	public int getCols()
	{
		return 12;
	}

	//this method gets the value of a cell 
	@Override
	public Cell getCell(Location loc)
	{
		row= loc.getRow();
		cols= loc.getCol();
		return spreadsheet [row][cols];
		
	}
	//creates a the spreadsheet
	@Override
	public String getGridText()
	{
		String grid="";
		String firstLine = ("   |A         |B         |C         |D         |E         |F         |G         |H         |I         |J         |K         |L         |") ;
		firstLine += ("\n");
				
		for (int i=0; i<20; i++){
			if (i<9){
				grid+= ((i+1) + "  " + "|");
				for (int j=0; j<=11;j++){
					grid+=(spreadsheet[i][j].abbreviatedCellText() + "|");
					// spreadsheet[i][j].abbreviatedCellText()
				}
				grid+="\n";
			}
			if (i>=9){
				grid+=((i+1) + " " + "|");
				for (int k=0; k<=11;k++){
					grid+=(spreadsheet[i][k].abbreviatedCellText() + "|");
			}
			grid+= "\n";
			
		}
	}
		return firstLine + grid;
	}
}
	
	
