package textExcel;

public class TextCell implements Cell{
	
	private String input; 

	public TextCell(String value){
		input=value; 
	}

	@Override
	public String abbreviatedCellText() {
		//if (input.substring(0,1).equals("\"") && input.indexOf(input.length()-1).equals(""){
		if (input.length()==0){
			return input;
		}
		if (input.length()>0){
		String text  = input.substring(0, input.length()-2); 
		if (input.equals("")){
			return (input);
		}
			if (text.length() > 10) {
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
	return input.substring(0, input.length()-2);
	
}

	@Override
	public String fullCellText() {
		return ("\"" + input + "\"" );
	}

}