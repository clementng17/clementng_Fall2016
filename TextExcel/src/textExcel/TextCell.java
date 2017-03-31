package textExcel;

public class TextCell implements Cell{
	
	private String input; 

	public TextCell(String value){
		input=value; 
	}

	@Override
	public String abbreviatedCellText() {
		//if (input.substring(0,1).equals("\"") && input.substring(input.length()-1, input.length()).equals("\"")){
		String text = input.substring(1, input.length()-1); 
			if (text.equals("")){
				return ("          ");
			}
			else if (text.length() > 10) {
				return text.substring(0, 10); 
			} 
			else if (text.length() < 10) {
				for(int i=1; i+text.length()<=10;i++){
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
