package textExcel;

public class PercentCell extends RealCell{

	private String input;
	
	public PercentCell(String value) {
		super(value);
	}
	

	@Override
	public String abbreviatedCellText() {
		
		String store = (int)(getDoubleValue()) + "";
//		if ((input.indexOf(1)+ "").equals(".")){
//			return input.indexOf(0) + "%";
//		}
		if (store.length()>9){
//		String percentage= super.getDoubleValue() + "%";
//		percentage += "          ";
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
