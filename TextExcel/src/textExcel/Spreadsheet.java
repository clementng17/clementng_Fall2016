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
		return null;
	}

}