
import java.util.*;
public class FracCalc {

    

	public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
		System.out.println("Type your equation.");
		Scanner userInput = new Scanner (System.in);
		String Input = userInput.nextLine();
    	while (!Input.equals("quit")){
    		Input = userInput.nextLine();
    		System.out.println(produceAnswer(Input)); 

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
    
    public static String[] parseSpace(String input){
    	String space= " ";
    	String [] operandsOperator= input.split(space);
    	return operandsOperator;
    }
    
    public static String produceAnswer(String input){ 
        // TODO: Implement this function to produce the solution to the input
    	 //Checkpoint1: takes in a formula and returns the second operand
    	String [] equation = parseSpace(input);
    	String result= "";
    	if (equation.length<4){
    		String operand1 = equation [0]; 
			String operand2 = equation [2];   
			String operator = equation [1];
    	}
    	if (equation.length>4){
    		for (int i=1; i< equation.length;i+=2){
    			if (!equation[i].equals("+")){
    				result= addFrac(parseOperand(input));
    				return result;
    			}
    			if (!equation[i].equals("-")){
    				result= minusFrac(parseOperand(input));
    				return result;
	    		}
	    		if (!equation[i].equals("*")){
	    			result= multiply(parseOperand(input));
	    			return result;
	    		}
	    		if (!equation[i].equals("/")){
	    			result= divide(parseOperand(input));
	    			return result;
	    		}else {
	    			return "no result";
	    		}
    		
    		}
    	}
    }
        //Checkpoint2: separates the first and second operand into its wholenumber, numerator, and denominator
    	public static int[] parseOperand(String operand){
    		
    		int wholenumber= 0;
    		int numerator= 0;
    		int denominator= 0;
	    		if (operand.indexOf("/")==-1 && (operand.indexOf("_")==-1)){
	    			wholenumber = Integer.parseInt(operand);
	    			numerator=0; 
	    			denominator=1;
	    		}
	    		else if (operand.indexOf("_")==-1 && operand.indexOf("/")>0){
	    			String[] fraction= operand.split("/");
	    			numerator= Integer.parseInt(fraction [0]);
	    			denominator= Integer.parseInt(fraction [1]);
	    		} else {
			    String [] FirstOperand = operand.split("_");
		   		wholenumber = Integer.parseInt(FirstOperand [0]);
		   	    String fraction1 = FirstOperand [1];
		   		String [] Fraction1 = fraction1.split("/");
		        numerator = Integer.parseInt(Fraction1 [0]);
		        denominator = Integer.parseInt(Fraction1 [1]);
	    		}
    		int []insideOperand = {wholenumber, numerator, denominator};
    		return insideOperand;
    		 
    	}
        
        //Checkpoint3: performs the calculations according to the operator
    	
    	/*
        if (operator == "+"){
        	addFrac(wholenumber1, numerator1, denominator1, wholenumber2, numerator2, denominator2);
        }
        if (operator == "-"){
        	minusFrac(wholenumber1, numerator1, denominator1, wholenumber2, numerator2, denominator2);
        }
        if (operator == "*"){
        	multiply(wholenumber1, numerator1, denominator1, wholenumber2, numerator2, denominator2);
        }
        if (operator == "/"){
        	divide(wholenumber1, numerator1, denominator1, wholenumber2, numerator2, denominator2);
        }
        else {
        	return ("no calculations performed");
        }
        
	    return ("operand 1= " + operand1 + " " + "operand 2= " + operand2 + " First operand- whole:" + wholenumber1 + " " + "numerator:" + numerator1 + " " + "denominator:" + denominator1
        + " Second operand- whole:" + wholenumber2 + " " + "numerator:" + numerator2 + " " + "denominator:" + denominator2);
        */
        //calculating formula
        
    }
       
        	       
   	 // add the the operands 
   	 	public static String addFrac(int [] operand1, int [] operand2){
   	 		int sum= 0;
   	 		if (operand1[1]==0 && operand2[1]== 0){
   	 			sum= (operand1[0]+operand2[0]);
   	 			return ("sum is " + sum); 
   	 		}
        	if (operand1[2]== operand2[2] ){
        		int newNumerator= operand1[1]+operand2[1]; 
        		int newWholenumber= operand1[0]+operand2[0]; 
        		if (newNumerator >= operand1[2]){
        			int remainder= newNumerator/operand1[2]; 
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
        	else {
    			return ("no calculations performed");
    		}
        }
   	 	
	   	
	   	 // subtract the first operand from the second operand 
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
        		else {
        			return ("sum is" + newWholenumber + "_" + newNumerator+ "/" + denominator1);
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
	 		else {
    			return ("no calculations performed");
    		}
        
   	 	}   
	   	 
	   	 // multiply the two operands
   	 	public static String multiply(int wholenumber1, int numerator1, int denominator1, int wholenumber2, int numerator2, int denominator2){
   	 		int Numerator1=((wholenumber1*denominator1)+denominator1);
   	 		int Numerator2=((wholenumber2*denominator2)+denominator2);
   	 		int newDenominator= denominator1*denominator2;
   	 		int newNumerator= Numerator1+Numerator2;
   	 		return ("product is " + newNumerator+ "/" + newDenominator);
   	 	}
   	 	
   	 	//divide the two operands
   	 	public static String divide(int wholenumber1, int numerator1, int denominator1, int wholenumber2, int numerator2, int denominator2){
   	 		int Numerator1=((wholenumber1*denominator1)+denominator1);
	 		int Numerator2=((wholenumber2*denominator2)+denominator2);
   	 		int newNumerator= (Numerator1*denominator2);
   	 		int newDenominator=  (denominator1*Numerator2);
   	 		return ("quotient is " + newNumerator+ "/" + newDenominator);
   	 	}
        
}
    

    // TODO: Fill in the space below with any helper methods that you think you will need
    
