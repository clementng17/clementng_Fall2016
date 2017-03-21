package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid  
{
	int row;
	int cols;
	
	public void Spreasheet(int row, int cols){
		
		this.row= row;
		this.cols= cols;
		int [][] EmptyCellArray = new int[12][20];
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
		String tenspaces="          ";
		String ninespaces="         ";
		//12
		//first row 
		firstline= ("   ");
		for (int i=0; i<=11;i++){
			firstline+=("|" + alphabet.charAt(i)+ ninespaces);
		}
		firstline+= ("\n");
		for (int i=1; i<=20; i++){
			if (i<10){
				grid+= (i + "  "+ "\n");
				for (int j=1; j<=12;i++){
					grid+=("|" + tenspaces);
				}
			}
			if (i>=10){
				grid+=(i + " " + "\n");
				for (int k=1; k<=12;i++){
					grid+=("|" + tenspaces);
			}
			
		}
	}
		return firstline + grid;
}
}
	
	
