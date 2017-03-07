package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	private int cols;
	private String cellName;
    
	
	 public SpreadsheetLocation(String cell)
	    {
	    	cellName= cell;
	    }
	  
    @Override
    public int getRow()
    {
    	int row= Integer.parseInt(cellName.substring(1));
        return (row-1);
    }
    
    @Override
    public int getCol()
    {
    	String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	for (int i =0; i <28;i++){
	   		 if  (cellName.charAt(0) == alphabet.charAt(i)){
	   			 cols=i; 
	   		 }
    	}
    	return cols;
    }
    
}
