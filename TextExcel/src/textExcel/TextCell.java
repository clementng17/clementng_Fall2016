package textExcel;

public class TextCell implements Cell{

	public TextCell(String value){
		
	}

	@Override
	public String abbreviatedCellText() {
		return "          ";
	}

	@Override
	public String fullCellText() {
		return null;
	}

}
