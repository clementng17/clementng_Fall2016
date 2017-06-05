package textExcel;

//public class TextCell implements Cell{

public class TextCell implements Cell {

	//truncates cell 
	private String text;
	@Override
	public String abbreviatedCellText() {
		String truncate = text;
		truncate += "          ";
		return truncate.substring(0,10); 
	}

	//puts in quotes 
	@Override
	public String fullCellText() {
		
		return   "\"" + text + "\"" ;
	}
	
	public TextCell(String input){
		text = input;
	}

}
