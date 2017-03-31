package textExcel;

public class TextCell implements Cell{
	
	private String input; 

	public TextCell(String value){
		input=value; 
	}

	@Override
	public String abbreviatedCellText() {
		//if (input.substring(0,1).equals("\"") && input.indexOf(input.length()-1).equals(""){
		String text = input.substring(0, input.length()-2); 
			if (text.equals("")){
				return ("          ");
			}
			else if (text.length() > 10) {
				text = input.substring(0, input.length()-2); 
				return text.substring(0, 10); 
			} 
			else if (text.length() < 10) {
				text = input.substring(0, input.length());
				while(text.length()<10){
					text += " ";
				}
				return text;
				
			} else if (text.length() == 10){
				return text;
			}else {
				return text;
		} 
}

	@Override
	public String fullCellText() {
		return ("\"" + input + "\"" );
	}

}
