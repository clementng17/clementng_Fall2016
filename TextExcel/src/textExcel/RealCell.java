package textExcel;

public class RealCell implements Cell {

	private String input;
	
	public RealCell(String value){
		input=value;
	}
	
	@Override
	//truncates cell
	public String abbreviatedCellText() {
		

		double input2;
		input2= Double.parseDouble(input);
		
		String Truncatedtext= input2 + "          ";
		return Truncatedtext.substring(0,10);
	}

	@Override
	public String fullCellText() {
		return input;
	}
	
	//changes input into a double
	public double getDoubleValue(){
		return Double.parseDouble(input);
	}

}
