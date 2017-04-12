package textExcel;

public class RealCell implements Cell {

	private String input;
	
	public RealCell(String value){
		input=value;
	}
	
	@Override
	public String abbreviatedCellText() {
		String Truncatedtext= input + "          ";
		return Truncatedtext.substring(0,10);
	}

	@Override
	public String fullCellText() {
		return input;
	}
	public double getDoubleValue(){
		return Double.parseDouble(input);
	}

}
