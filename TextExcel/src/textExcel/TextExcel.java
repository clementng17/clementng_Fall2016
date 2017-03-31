package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel  {

	public static void main(String[] args){
	    // Add your command loop here
		//TestsALL.Helper th = new TestsALL.Helper();
        //System.out.println(th.getText());
		Spreadsheet table = new Spreadsheet(); 
		//System.out.println(table[1][1].abbreviatedCellText());
		//System.out.print(table.getGridText());
		
		Scanner input= new Scanner (System.in);
		String command= input.nextLine();
		while(!command.equals("quit")){
			try { 
				System.out.print(table.processCommand(command));
			} catch (NumberFormatException e){
				System.out.println("Not a valid input value");

			} catch (IndexOutOfBoundsException e){
				System.out.println("Not a valid input value");
			}
			table.processCommand(command);
			command=input.nextLine();
		}
	
		
	}
}
