package textExcel;
 
public class FormulaCell extends RealCell {
 
	private String input;
	private Cell [][] spreadsheet;
	
	public FormulaCell(String value, Cell [][] spreadsheetInput ) {
		super(value);
		input= value;
		spreadsheet = spreadsheetInput;
	}
	
	@Override
	public double getDoubleValue(){
		//separates the components of the formula 
		String [ ] formula = input.substring(2, input.length()-2).split(" ");
		double result=0;
		
		    //checks for "SUM" in formula
	        if (formula[0].equalsIgnoreCase("SUM")){
	        	result+= getSum(formula[1]);
	        }
	        
	        //checks for "AVG" in formula
	        else if (formula[0].equalsIgnoreCase("AVG")){
	        	result+= getAvg(formula[1]);
	        }
	        		
	        //checks if cell-name is first in the formula 
	        else if (formula[0].toUpperCase().charAt(0)<77&&formula[0].toUpperCase().charAt(0)>64){
				SpreadsheetLocation location= new SpreadsheetLocation (formula[0].toUpperCase());
				result = result + ((RealCell)(spreadsheet[location.getRow()][location.getCol()])).getDoubleValue();
			}
	        
	        //checks if a number is first in the formula
	        else {
	        	result = Double.parseDouble(formula[0]);
	        }
	        	
	        //adds the values of cell
			for (int i=1; i<formula.length;i+=2 ){
				if (formula[i].equals("+")){
					if (formula[i+1].toUpperCase().charAt(0)>64 &&formula[i+1].toUpperCase().charAt(0)<77){
						SpreadsheetLocation location= new SpreadsheetLocation (formula[i+1].toUpperCase());
						result += ((RealCell)(spreadsheet[location.getRow()][location.getCol()])).getDoubleValue();
					}
					else {
						result+=  Double.parseDouble(formula[i+1]);
					}
			}
		        //substracts the values of cell
				if (formula[i].equals("-")){
					if (formula[i+1].toUpperCase().charAt(0)>64 &&formula[i+1].toUpperCase().charAt(0)<77){
						SpreadsheetLocation location= new SpreadsheetLocation (formula[i+1].toUpperCase());
						result -= ((RealCell)(spreadsheet[location.getRow()][location.getCol()])).getDoubleValue();
					}
					else {
						result-=  Double.parseDouble(formula[i+1]);
					}
				}
		        //multiply the values of cell
				if (formula[i].equals("*")){
					if (formula[i+1].toUpperCase().charAt(0)>64 &&formula[i+1].toUpperCase().charAt(0)<77){
						SpreadsheetLocation location= new SpreadsheetLocation (formula[i+1].toUpperCase());
						result *= ((RealCell)(spreadsheet[location.getRow()][location.getCol()])).getDoubleValue();
					}
					else {
					result*=  Double.parseDouble(formula[i+1]);
					}
				}
				//divide the values of cell
				if (formula[i].equals("/")){
					if (formula[i+1].toUpperCase().charAt(0)>64 &&formula[i+1].toUpperCase().charAt(0)<77){
						SpreadsheetLocation location= new SpreadsheetLocation (formula[i+1].toUpperCase());
						result /= ((RealCell)(spreadsheet[location.getRow()][location.getCol()])).getDoubleValue();
					}
					else {
				
					result/=  Double.parseDouble(formula[i+1]);
					}
				}	
		}
		return result;
	}
	
	//returns sum 
	public double getSum(String input){
		String [] store = input.split("-"); 
		SpreadsheetLocation first = new SpreadsheetLocation(store[0].toUpperCase()); 
		SpreadsheetLocation end = new SpreadsheetLocation(store[1].toUpperCase()); 
		double sum = 0;
		//checks if it's a single cell
		if (end.getRow()==first.getRow() && end.getCol()==first.getCol()){
			return ((RealCell)spreadsheet[first.getRow()][first.getCol()]).getDoubleValue();
		}
		//checks if it's single row 
		else if (first.getRow() == end.getRow()){
			for (int j = first.getCol(); j<= end.getCol();j++){
				sum += ((RealCell)spreadsheet[first.getRow()][j]).getDoubleValue(); 
			}
		}
		//checks if it's a single column 
		else if (first.getCol() == end.getCol()){
			for (int i = first.getRow(); i<= end.getRow(); i++ ){
				sum += ((RealCell)spreadsheet[i][first.getCol()]).getDoubleValue(); 
			}
		}
		else{
			for (int i = first.getRow(); i<= end.getRow(); i++ ){
				for (int j = first.getCol(); j<= end.getCol();j++){
					sum += ((RealCell)spreadsheet[i][j]).getDoubleValue(); 
		}
			}
		}
			return sum;
	}
	//gets the average 
	public double getAvg(String input){
		String [] store = input.split("-"); 
		SpreadsheetLocation first = new SpreadsheetLocation(store[0]); 
		SpreadsheetLocation end = new SpreadsheetLocation(store[1]); 
		double avg= getSum(input);
		//checks if it's a single cell
		if (end.getRow()==first.getRow() && end.getCol()==first.getCol()){
			return avg;
		}
		//checks if it's single row 
		else if (end.getRow()==first.getRow()){
			return avg /= (end.getCol()-first.getCol()+1);
		}
		//checks if it's single column
		else if (end.getCol()==first.getCol()){
			return avg /= (end.getRow()-first.getRow()+1);
		}
		
		else {
			avg /= ((end.getRow()-first.getRow()+1)*(end.getCol()-first.getCol()+1));
		}
		return avg; 
	}
	
	//truncates cell 
	@Override
	public String abbreviatedCellText() {
		String Truncatedtext= getDoubleValue() + "          ";
		return Truncatedtext.substring(0,10);
	}
	
	@Override
	public String fullCellText() {
		return super.fullCellText();
	}
}
 