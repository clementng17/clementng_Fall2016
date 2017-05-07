package textExcel;

public class RealCell implements Cell {

	private String input;
	
	public RealCell(String value){
		input=value;
	}
	
	@Override
	public String abbreviatedCellText() {
		
		
//		if (input.indexOf(".")<0){
//			input = input + ".0";
//	}
		double input2;
		input2= Double.parseDouble(input);
		
		String Truncatedtext= input2 + "          ";
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
