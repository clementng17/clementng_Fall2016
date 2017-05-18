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
	
	        if (formula[0].toUpperCase().equals("SUM")){
	        	return getSum(formula[1]);
	        }
	        
	        if (formula[0].toUpperCase().equals("AVG")){
	        	return getAvg(formula[1]);
	        }
	        
			double result=Double.parseDouble(formula[0]);

	        		
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
				if (formula[i].equals("-")){
					if (formula[i+1].toUpperCase().charAt(0)>64 &&formula[i+1].toUpperCase().charAt(0)<77){
						SpreadsheetLocation location= new SpreadsheetLocation (formula[i+1].toUpperCase());
						result -= ((RealCell)(spreadsheet[location.getRow()][location.getCol()])).getDoubleValue();
					}
					else {
						result-=  Double.parseDouble(formula[i+1]);
					}
				}
				if (formula[i].equals("*")){
					if (formula[i+1].toUpperCase().charAt(0)>64 &&formula[i+1].toUpperCase().charAt(0)<77){
						SpreadsheetLocation location= new SpreadsheetLocation (formula[i+1].toUpperCase());
						result *= ((RealCell)(spreadsheet[location.getRow()][location.getCol()])).getDoubleValue();
					}
					else {
					result*=  Double.parseDouble(formula[i+1]);
					}
				}
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
	
	public double getSum(String input){
		String [] store = input.split("-"); 
		double sum=0;
		SpreadsheetLocation first = new SpreadsheetLocation(store[0]); 
		SpreadsheetLocation end = new SpreadsheetLocation(store[1]); 
		for (int i = first.getRow(); i< end.getRow(); i++ ){
			for (int j = first.getCol(); i< end.getCol();i++){
//				SpreadsheetLocation additive= new SpreadsheetLocation((char)j+i+"");
				sum += ((RealCell)spreadsheet[i][j]).getDoubleValue(); 
			}
		}
		return sum; 
		
	}
	
	public double getAvg(String input){
		String [] store = input.split("-"); 
		SpreadsheetLocation first = new SpreadsheetLocation(store[0]); 
		SpreadsheetLocation end = new SpreadsheetLocation(store[1]); 
		double avg= getSum(input);
		avg /= ((end.getRow()-first.getRow())*(end.getCol()-first.getCol()));
		return avg; 
	}
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
