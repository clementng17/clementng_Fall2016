package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel  {

	public static void main(String[] args){
	    // Add your command loop here
;
		Spreadsheet table = new Spreadsheet(); 
		
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
			//catches exceptions 
			table.processCommand(command);
			command=input.nextLine();
		}
	
		
	}
}
