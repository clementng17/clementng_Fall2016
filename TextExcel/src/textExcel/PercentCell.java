package textExcel;

public class PercentCell extends RealCell{

	private String input;
	
	public PercentCell(String value) {
		super(value);
	}
	
	//truncates cell and adds a percentage 
	@Override
	public String abbreviatedCellText() {
		
		String store = (int)(getDoubleValue()) + "";

		if (store.length()>9){

		return store.substring(0,10) + "%";
		}
		else { 
			store+= "%          ";
			return store.substring(0,10);
		}
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
