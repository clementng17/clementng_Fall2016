package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	private int row;
	private int cols;
	public String alphabet = "ABCDEFJHIJKLMNOPQRSTUVWXYZ";

    @Override
    public int getRow()
    {
        return row;
    }

    @Override
    public int getCol()
    {
        return cols;
    }
    
    public void convertToNumericalValue(String cellName){
    	 for (int i =0; i <28;i++){
    		 if  (cellName.charAt(0) == alphabet.charAt(i)){
    			 cols=i; 
    		 }
    	 }
    	 row= (Integer.parseInt(cellName.substring(1))-1); 
    
    }
    
    public SpreadsheetLocation(String cellName)
    {
    	convertToNumericalValue(cellName);
    }

}
