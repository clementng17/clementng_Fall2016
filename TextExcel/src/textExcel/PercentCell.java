package textExcel;

public class PercentCell extends RealCell{

	
	public PercentCell(String input) {
		super(input);
	}
	
	@Override
	public String abbreviatedCellText() {
		String percentage= super.getDoubleValue() + "%";
		percentage += "          ";
		return percentage.substring(0,10);
	}

	@Override
	public double getDoubleValue(){
		return Double.parseDouble(super.fullCellText().substring(0, super.fullCellText().length()-1));
	}
	//get rid of the percent sign at the end 
	
	@Override
	public String fullCellText() {
		return (getDoubleValue()/100.0 + "");
	}
}
