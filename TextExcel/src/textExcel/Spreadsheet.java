package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid  
{
	int row;
	int cols;
	Cell [][] spreadsheet= new Cell[20][12];
	
	public void Spreasheet(int row, int cols){
		
		this.row= row;
		this.cols= cols;
		int [][] EmptyCellArray =  new int[20][12];
	}
	
	@Override
	public String processCommand(String command)
	{
		String [] arr1= command.split(" ",3);
		return command;
	}
	
	public String parseCell(String location){
		
		int colNumber = Character.toUpperCase(str.charAt(i)) - 'A';
		
	}
	
	
	public void clearAll() {
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
	
	public Cell inspect(Location loc){
		row=loc.getRow();
		cols=loc.getCol();
		return spreadsheet[row][cols];
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
		String alphabet= "ABCDEFGHIJKL";
		//12 letters
		String firstline="";
		String grid="";
		String ninespaces="         ";
		String tenspaces="          ";
		//first row 
		firstline= ("   ");
		for (int i=0; i<=11;i++){
			firstline+=("|" + alphabet.charAt(i)+ ninespaces);
		}
		firstline+= ("\n");
		for (int i=0; i<=19; i++){
			if (i<19){
				grid+= ((i+1) + "  "+ "\n");
				for (int j=1; j<=12;i++){
					grid+=("|" + tenspaces);
					// spreadsheet[i][j].abbreviatedCellText()
				}
			}
			if (i>=9){
				grid+=((i+1) + " " + "\n");
				for (int k=0; k<=11;i++){
					grid+=("|" + tenspaces);
			}
			
		}
	}
		return firstline + grid;
	}
}
	
	
