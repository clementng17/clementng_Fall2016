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
	
		
		String [] arr1= command.split(" ");
	    if (command.equals("")){
	    	return "";
	    }
		
		
		if (command.equalsIgnoreCase("clear")){
		    clear();
		    return getGridText();
		 } else if (((arr1[1].length() <=3) && (arr1[1].length() > 0)) && (arr1[0].equalsIgnoreCase("clear"))){
				SpreadsheetLocation location= new SpreadsheetLocation(arr1[1]);
				clearCell(location);
				return getGridText();
		} else if (arr1[1].equals("=")){
			SpreadsheetLocation location= new SpreadsheetLocation(arr1[0]);
			String input= command.substring(command.indexOf("\""),command.length());
			input= input.substring(1, input.length()-1);
			setCell(location,  new TextCell(input));
			return getGridText();
		
		}else{
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
	
	public void clear() {
		Cell [][] spreadsheet1 =  spreadsheet;
		for (int i=0; i<=19;i++){
			for(int j=0; j<=11;j++){
				spreadsheet1[i][j]= new EmptyCell();
			}
		}
		
	}
	
	public void clearCell(Location loc){
		row=loc.getRow();
		cols= loc.getCol();
		spreadsheet[row][cols]= new EmptyCell();
		
	}
	
	public void setCell(Location loc, Cell input){
		row=loc.getRow();
		cols=loc.getCol();
		spreadsheet[row][cols]= input;
	}
	
	@Override
	public int getRows()
	{
		return 20;
	}

	@Override
	public int getCols()
	{
		return 12;
	}

	@Override
	public Cell getCell(Location loc)
	{
		row= loc.getRow();
		cols= loc.getCol();
		return spreadsheet [row][cols];
		
	}

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
	
	
