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
	public String getGridText()
	{
		String alphabet= "ABCDEFGHIJKL";
		//12
		//first row 
		System.out.print(print3spaces());
		for (int i=0; i<=11;i++){
			System.out.print("|" + alphabet.charAt(i)+ print9spaces());
		}
		System.out.println("");
		for (int i=1; i<=20; i++){
			if (i<10){
				System.out.println(i + print2spaces());
				for (int j=1; j<=12;i++){
					System.out.print("|" + print10spaces());
				}
			}
			
		}
			
		return null;
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
	public String print1space(){
		return (" ");
	}
	public String print10spaces(){
		return("          ");
	}
}
