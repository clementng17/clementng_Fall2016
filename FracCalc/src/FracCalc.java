package fracCalc;
import java.util.Scanner*
public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner UserInput = new Scanner (System.in);
    	String Input = UserInput.toString();
    	System.out.println(Input);
    	produceAnswer();
    
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
		String space = " ";
		String[] inputArray = input.split(space);
		String operand1 = inputArray [0]; 
		String operand2 = inputArray [2];   
		String operator = inputArray[1];
	    return "operand 1= " + operand1;
        return "operand 2= " + operand2;
        //Checkpoint1: takes in a formula and returns the second operand
        String wholenumber = "null";
        String numerator = "null";
        String denominator = "null";
        String underline = "_";
        String [] SecondOperand = operand2.split(underline);
        wholenumber = SecondOperand [0];
        String fraction = SecondOperand [1];
        String FractionLine = "/";
        String [] Fraction = fraction.split(FractionLine);
        numerator = Fraction [0];
        denominator = Fraction [1];
        return ("whole:" + wholenumber + " " + "numerator:" + numerator + " " + "denominator:" + denominator);
        //Checkpoint2: separates the second operand into its wholenumber, numerator, and denominator
        
        if (operator == "+"){
        	if (denominator )
        }
        
         
        
        
        
	
    

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
}