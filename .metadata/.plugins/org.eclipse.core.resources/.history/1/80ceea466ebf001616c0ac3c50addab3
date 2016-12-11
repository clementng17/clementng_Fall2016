package fracCalc;
import java.util.Scanner*
public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	String Input = "null";
    	while ( Input != "quit"){
    	Scanner UserInput = new Scanner (System.in);
    	Input = UserInput.toString();
    	System.out.println(Input);
    	produceAnswer(Input); 
    	}
    	
    }
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
    	
    	Scanner UserInput = new Scanner (System.in);
    	input = UserInput.toString();
    
        // TODO: Implement this function to produce the solution to the input
    	 //Checkpoint1: takes in a formula and returns the second operand
    	
		String space = " ";
		String[] inputArray = input.split(space);
		String operand1 = inputArray [0]; 
		String operand2 = inputArray [2];   
		String operator = inputArray[1];
		parseInput(operand1, operand2);
	 
	    return "operand 1= " + operand1 + " " + "operand 2= " + operand2;
       
    }
        //Checkpoint2: separates the second operand into its wholenumber, numerator, and denominator
    
   	 public static String parseInput(String operand1, String operand2){

        String underline = "_";
        String FractionLine = "/";

   		 
   		String [] FirstOperand = operand1.split(underline);
   		int wholenumber1 = Integer.parseInt(FirstOperand [0]);
   	    String fraction1 = FirstOperand [1];
   		String [] Fraction1 = fraction1.split(FractionLine);
        int numerator1 = Integer.parseInt(Fraction1 [0]);
        int denominator1 = Integer.parseInt(Fraction1 [1]);
      
        String [] SecondOperand = operand2.split(underline);
        int wholenumber2 = Integer.parseInt(SecondOperand [0]);
        String fraction2 = SecondOperand [1];
        String [] Fraction2 = fraction2.split(FractionLine);
        int numerator2 = Integer.parseInt(Fraction2 [0]);
        int denominator2 = Integer.parseInt(Fraction2 [1]);
        
      
        return ("First operand- whole:" + wholenumber1 + " " + "numerator:" + numerator1 + " " + "denominator:" + denominator1);
        return ("Second operand- whole:" + wholenumber2 + " " + "numerator:" + numerator2 + " " + "denominator:" + denominator2);
        
   	 }
        //Checkpoint3
   	 	public static String addFrac(String operand1, String operand2){
        parseInput(operand1, operand2);
        
        }
        
}     
        
        
        
	
    

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
}