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
	 
	    return "operand 1= " + operand1 + " " + "operand 2= " + operand2;
    /*   
    }
        //Checkpoint2: separates the second operand into its wholenumber, numerator, and denominator
    
   	 public static String parseInput(String operand1, String operand2){
*/
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
        
        //calculating formula
        if (operator == "+"){
        	addFrac(wholenumber1, numerator1, denominator1, wholenumber2, numerator2, denominator2);
        }
        if (operator == "-"){
        	minusFrac(wholenumber1, numerator1, denominator1, wholenumber2, numerator2, denominator2);
        }
        if (operator == "*"){
        	multiply(wholenumber1, numerator1, denominator1, wholenumber2, numerator2, denominator2);
        }
   	 }
        //Checkpoint3
   	 	public static String addFrac(int wholenumber1, int numerator1, int denominator1, int wholenumber2, int numerator2, int denominator2){
   	 		int sum= 0;
   	 		if (numerator1==0 && numerator2== 0){
   	 			sum= (wholenumber1+wholenumber2);
   	 			return ("sum is " + sum); 
   	 		}
        	if (denominator1== denominator2 ){
        		int newNumerator= numerator1+numerator2; 
        		int newWholenumber= wholenumber1+wholenumber2; 
        		if (newNumerator >= denominator1){
        			int remainder= newNumerator/denominator1; 
        			newNumerator= (newNumerator-(remainder*denominator1));
        			return ("sum is "+ newWholenumber+remainder+ "_" + newNumerator + "/" + denominator1);
        		}
        		else {
        			return ("sum is" + newWholenumber + "_" + newNumerator+ "/" + denominator1);
        		}
        	}
        	if (denominator1 != denominator2){
        		int newDenominator= denominator1*denominator2;
        		int newNumerator= numerator1*denominator2+numerator2*denominator1; 
        		int newWholenumber= wholenumber1+wholenumber2; 
        		if (newNumerator >= newDenominator){
        			int remainder= newNumerator/newDenominator; 
        			newNumerator= (newNumerator-(remainder*newDenominator));
        			return ("sum is "+ newWholenumber+remainder+ "_" + newNumerator + "/" + newDenominator);
        		}
        		else {
        			return ("sum is" + newWholenumber + "_" + newNumerator+ "/" + newDenominator);
        		}
        	}
        	
        }
   	 	
	   	
	   	 
   	 	public static String minusFrac(int wholenumber1, int numerator1, int denominator1, int wholenumber2, int numerator2, int denominator2){
   	 	int difference= 0;
	 		if (numerator1==0 && numerator2== 0){
	 			difference= (wholenumber1-wholenumber2);
	 			return ("difference is " + difference); 
	 		}
	 		if (denominator1== denominator2 ){
        		int newNumerator= numerator1-numerator2; 
        		int newWholenumber= wholenumber1-wholenumber2; 
        		if (newNumerator >= denominator1){
        			int remainder= newNumerator/denominator1; 
        			newNumerator= (newNumerator-(remainder*denominator1));
        			return ("difference is "+ newWholenumber+remainder+ "_" + newNumerator + "/" + denominator1);
        		}
         		
	 		}
	 		if (denominator1 != denominator2){
        		int newDenominator= denominator1*denominator2;
        		int newNumerator= numerator1*denominator2-numerator2*denominator1; 
        		int newWholenumber= wholenumber1-wholenumber2; 
        		if (newNumerator >= newDenominator){
        			int remainder= newNumerator/newDenominator; 
        			newNumerator= (newNumerator-(remainder*newDenominator));
        			return ("sum is "+ newWholenumber+remainder+ "_" + newNumerator + "/" + newDenominator);
        		}
        		else {
        			return ("difference is" + newWholenumber + "_" + newNumerator+ "/" + newDenominator);
        		}
   	 	     }     
        
   	 	}   
	   	 public static String toImproperFrac(int wholenumber, int numerator, int denominator){
		 	int newNumerator=((wholenumber*denominator)+denominator);
		 	String ImproperFrac= (numerator+"/"+denominator );
			return ImproperFrac;
	   	 }
	   	 
   	 	public static String multiply(int wholenumber1, int numerator1, int denominator1, int wholenumber2, int numerator2, int denominator2){
   	 		int Numerator1=((wholenumber1*denominator1)+denominator1);
   	 		int Numerator2=((wholenumber2*denominator2)+denominator2);
   	 		int newDenominator= denominator1*denominator2;
   	 		int newNumerator= Numerator1+Numerator2;
   	 		return ("product is " + newNumerator+ "/" + newDenominator);
   	 	}
   	 	
   	 	public static String divide(int wholenumber1, int numerator1, int denominator1, int wholenumber2, int numerator2, int denominator2){
   	 		int Numerator1=((wholenumber1*denominator1)+denominator1);
	 		int Numerator2=((wholenumber2*denominator2)+denominator2);
   	 		int newNumerator= (Numerator1*denominator2);
   	 		int newDenominator=  (denominator1*Numerator2);
   	 		return ("quotient is " + newNumerator+ "/" newDenominator);
   	 	}
        
}
    

    // TODO: Fill in the space below with any helper methods that you think you will need
    
