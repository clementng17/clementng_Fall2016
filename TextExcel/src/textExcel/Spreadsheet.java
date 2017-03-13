package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid  
{
	int row;
	int cols;
	
	public void Spreasheet(int row, int cols){
		
		this.row= row;
		this.cols= cols;
		int [][] EmptyCellArray = new int[12-1][20-1];
	}
	
	@Override
	public String processCommand(String command)
	{
		return command;
	}
	
	public String cellInspect(){
		
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
		return null;
	}

	@Override
	public  String getGridText()
	{
		String alphabet= "ABCDEFGHIJKL";
		String firstline;
		String grid="";
		//12
		//first row 
		firstline= (print3spaces());
		for (int i=0; i<=11;i++){
			firstline+=("|" + alphabet.charAt(i)+ print9spaces());
		}
		firstline+= ("\n");
		for (int i=1; i<=20; i++){
			if (i<10){
				grid+= (i + print2spaces()+ "\n");
				for (int j=1; j<=12;i++){
					grid+=("|" + print10spaces());
				}
			}
			if (i>=10){
				grid+=(i + " " + "\n");
				for (int k=1; k<=12;i++){
					grid+=("|" + print10spaces());
			}
			
		}
	}
		return firstline + grid;
}
	
	public String print9spaces(){
		return ("         ");
	}

	public String print3spaces(){
		return ("   ");
	}
	public String print2spaces(){
		return("  ");
		
	}
	public String print10spaces(){
		return("          ");
	}
}
