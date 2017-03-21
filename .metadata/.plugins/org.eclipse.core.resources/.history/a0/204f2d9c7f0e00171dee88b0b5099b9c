package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel  {

	public static void main(String[] args){
	    // Add your command loop here
		Spreadsheet table = new Spreadsheet(); 
		System.out.print(table.getGridText());
		TestsALL.Helper th = new TestsALL.Helper();
        System.out.println(th.getText());
		Scanner input= new Scanner (System.in);
		String command= input.nextLine();
		while(!command.equals("quit")){
			table.processCommand(command);
			command=input.nextLine();
		}
		
	
		
	}
}
