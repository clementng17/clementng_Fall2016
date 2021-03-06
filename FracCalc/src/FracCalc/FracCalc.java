/*
 * Clement Ng
 * AP Computer Science
 * Ms. Dreyer
 * 1st period
 * 12/23/16
 */
package FracCalc;
import java.util.*;
public class FracCalc {
	
	public static void main(String[] args) 
    {
        // take in an equation from client and calls produceAnser
		System.out.println("Type your equation.");
		Scanner userInput = new Scanner (System.in);
		String Input = userInput.nextLine();
    	while (!Input.equals("quit")){
    		System.out.println(produceAnswer(Input)); 
    		Input = userInput.nextLine();
    	}	
    }
   
    //eliminates the spaces between operators and operands
    public static String[] parseSpace(String input){
    	String space= " ";
    	String [] operandsOperator= input.split(space);
    	return operandsOperator;
    }
    
    public static String produceAnswer(String input){ 
       
    	//reminds client that there must be spaces between operators and operands 
    	if (input.indexOf(" ") ==-1){
    		return "invalid format";
    	}
    	//reminds client to type in an equation
    	if (input.equals(" ")){
    		return "Type your equation";
    	}
    	//reminds client that numbers cannot be divided by zero
    	if (input.indexOf("/0") >= 0){
    		return "ERROR: Cannot divide by 0.";
    	}
    	
    	//calls methods according to operators 
    	String [] equation = parseSpace(input);
    	int [] store= parseOperand(equation[0]);
    	if (equation.length<4){
    		String operand1 = equation [0]; 
			String operand2 = equation [2];   
			String operator = equation [1];
			if (operator.equals("+")){
				store= (addFrac(parseOperand(operand1), parseOperand(operand2)));
			}
			if (operator.equals("-")){
				store= (minusFrac(parseOperand(operand1), parseOperand(operand2)));
			}
			if (operator.equals("*")){
				store= (multiply(parseOperand(operand1), parseOperand(operand2)));
			}
			if (operator.equals("/")){
				store= (divide(parseOperand(operand1), parseOperand(operand2)));
			}
			return simplify(store);
    	}
    	//checks if there are more than 2 operands
    	if (equation.length>3){
    		int [] storeCalculation= parseOperand(equation[0]);
    		for (int i=1; i< equation.length;i+=2){
    			if (equation[i].equals("+")){
    				storeCalculation= addFrac(storeCalculation, parseOperand(equation[i+1]));
    			}
    			else if (equation[i].equals("-")){
    				storeCalculation= minusFrac(storeCalculation, parseOperand(equation[i+1]));
	    		}
    			else if (equation[i].equals("*")){
    				storeCalculation= multiply(storeCalculation, parseOperand(equation[i+1]));
	    		}
    			else if (equation[i].equals("/")){
    				storeCalculation= divide(storeCalculation, parseOperand(equation[i+1]));
	    		}else {
	    			return "no result";
	    		}
        		return (simplify(storeCalculation));
    		}
    		return (simplify(storeCalculation));
    	}
    	else
    		return "no results";
    }
        //separates an operand into its whole number, numerator, and denominator
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
        
    	//takes in the result of a calculation and returns the answer in a string format
    	public static String printAnswer(int [] answer) {
    		int numerator= answer[0];
    		int denominator= answer[1];
    			if (denominator ==0){
    				return "Error: undefined number.";
    			}
	    		if (numerator ==0){
	    		return "0";
	    		}
	    		if (numerator>0){
	    			return (numerator+"/"+denominator);
	    		}else {
	    			return "error";
	    		}
    	}	
    	//returns the answer in a simplified fraction
    	public static String simplify(int [] answer){
    		int numerator= answer[0];
    		int denominator= answer[1];
	    		if (denominator==0){
					return ("Error: Undefined number");
				}
	    		if (numerator==0 && denominator!=0){
	    			return ("0");
	    		}
    			if (denominator==1){
    				return (numerator + "");
    			}
    			if (numerator==denominator){
    				return ("1");
    			}
    			if (numerator%denominator==0){
    				return (numerator/denominator + "");
    			}
    			// finds the gcf of the denominator and numerator and dvidie both by gcf
    			if (numerator%denominator!=0){ 
    				int gcf= gcf(answer[0], answer[1]);
    
    				return (answer[0]/(gcf) + "/" + answer[1]/(gcf));
    			}else {
			    	return (numerator + "/" + denominator);
    			}
    	}
    	//finds the greatest common factor of two numbers
    	public static int gcf(int num1, int num2){
    		while (num1 != 0 && num2 != 0){
    			int gcf = num2;
    			num2 = num1 % num2;
    			num1 = gcf;
    		}
    		int gcf = num1 + num2;
    		return gcf;
    	}
    	
     
        	       
   	 // add the the operands 
   	 	public static int [] addFrac(int [] operand1, int [] operand2){
   	 		int newWholenumber= operand1[0]+ operand2[0];
   	 		int denominator= operand1[2]*operand2[2];
   	 		int numerator1= operand1[1]*operand2[2];
   	 		int numerator2= operand2[1]*operand1[2];
   	 		int newNumerator= numerator1 + numerator2;
   	 		int newnewNumerator= newWholenumber*denominator+newNumerator;
   	 		int answer []= {newnewNumerator, denominator};
   	 		return answer; 
        }
   	 	
	   	
	   	 // subtract the first operand from the second operand 
   	 	public static int [] minusFrac(int [] operand1, int [] operand2){
   	 	int newWholenumber= operand1[0] - operand2[0];
	 		int denominator= operand1[2]*operand2[2];
	 		int numerator1= operand1[1]*operand2[2];
	 		int numerator2= operand2[1]*operand1[2];
	 		int newNumerator= numerator1 - numerator2;
	 		int newnewNumerator= newWholenumber*denominator+newNumerator;
	 		int answer []= {newnewNumerator, denominator};
	 		return answer;
        
   	 	}   
	   	 
	   	 // multiply the two operands
   	 	public static int [] multiply(int [] operand1, int [] operand2){
   	 		
   	 		int Numerator1=((operand1[0]*operand1[2])+operand1[1]);
   	 		int Numerator2=((operand2[0]*operand2[2])+operand2[1]);
   	 		int newDenominator= operand1[2]*operand2[2];
   	 		int newNumerator= Numerator1*Numerator2;
   	 		int answer [] = {newNumerator, newDenominator};
   	 		return answer;
   	 	}
   	 	
   	 	//divide the two operands
   	 	public static int [] divide(int [] operand1, int [] operand2){
   	 		int Numerator1=((operand1[0]*operand1[2])+operand1[1]);
	 		int Numerator2=((operand2[0]*operand2[2])+operand2[1]);
   	 		int newNumerator= (Numerator1*operand2[2]);
   	 		int newDenominator=  (operand1[2]*Numerator2);
   	 		int answer [] = {newNumerator, newDenominator};
   	 		return answer;
   	 	}
        
}    