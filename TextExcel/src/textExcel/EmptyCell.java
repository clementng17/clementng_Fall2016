package textExcel;

public class EmptyCell implements Cell {

	//returns an empty cell 
	@Override
	public String abbreviatedCellText() {
		return "          ";
	}

	@Override
	public String fullCellText() {
		return "";
	}
	public EmptyCell(){
	}

}


