package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid  
{
	int row;
	int cols;
	
	public void Spreasheet(int row, int cols){
		
		this.row= row;
		this.cols= cols;
		int [][] EmptyCellArray = new int[cols-1][row-1];
	}
	
	@Override
	public String processCommand(String command)
	{
		return null;
	}

	@Override
	public int getRows()
	{
		return this.row;
	}

	@Override
	public int getCols()
	{
		return this.cols;
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
