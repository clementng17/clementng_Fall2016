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

		String [ ] formula = input.substring(2, input.length()-2).split(" ");
		double result=Double.parseDouble(formula[0]);
	
			for (int i=1; i<formula.length;i+=2 ){
				if (formula[i].equals("+")){
					result+=  Double.parseDouble(formula[i+1]);
			}
				if (formula[i].equals("-")){
					result-=  Double.parseDouble(formula[i+1]);
				}
				if (formula[i].equals("*")){
					result*=  Double.parseDouble(formula[i+1]);
				}
				if (formula[i].equals("/")){
					result/=  Double.parseDouble(formula[i+1]);

				}
			
		}
		return result;
		
		
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
