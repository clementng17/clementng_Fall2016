package textExcel;

public class FormulaCell extends RealCell {

	public FormulaCell(String input) {
		super(input);
	}
	
	/*
	@Override
	public double getDoubleValue(){
		String [ ] formula= input.split(" ");
		
	}
	
	@Override
	public String abbreviatedCellText() {
		String Truncatedtext= getDoubleValue() + "          ";
		return Truncatedtext.substring(0,10);
	
	}
	
	@Override
	public String fullCellText() {
	}
	*/

}
