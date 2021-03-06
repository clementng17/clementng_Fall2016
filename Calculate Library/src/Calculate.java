/*Clement Ng
 * 12/23/16
 * AP Computer Science- Math Library
 * 1st Period
 */

public class Calculate {
	
	public static int square(int number){
		return(number*number);
		 //squares a number
	}
	
	public static int cube(int number){ 
		return(number*number*number);
		//cubes a number
	}

	public static double average(double number1, double number2){ 
		return((number1+number2)/2);
		//finds the average of two numbers
	}
	
	public static double average(double number1, double number2, double number3){ 
		return((number1+number2+number3)/3);
		//finds the average of 3 numbers
	}
	
	public static double toDegrees(double number){
		double pie= 3.14159;
		double answer =(number*180/pie);
		return answer;
		//converts radians to degrees
	}
	
	public static double toRadians(double number){
		double pie= 3.14159;
		double answer = (number*pie/180);
		return answer;
		//converts degrees to radians 
	}
	
	public static double discriminant(double number1, double number2, double number3){ 
		return((number2*number2)-(4*number1*number3));
		//finds the discriminant from the coefficients a, b, and c of an equation
	}
	
	public static String toImproperFrac(int a, int b, int c){
		int numerator=((a*c)+b);
		String ImproperFrac= (numerator+"/"+c );
		return ImproperFrac;
		// takes in 3 numbers and finds the improper fraction
	}
	
	public static String toMixedNum(int number1, int number2){
		int wholenumber= number1/number2;
		int numerator=(number1%number2);
		return(wholenumber + "_" + numerator + "/" +number2);
		// finds the mixed number
	}
	
	public static String foil(int number1, int number2, int number3, int number4, String n){
		return(number1*number3 + n + "^2"+ ((number1*number4)+(number2*number3)) + n +number2*number4);
		// takes in 4 numbers and a variable and returns a quadratic equation in standard form
	}
	
	public static boolean isDivisibleBy(int a, int b){
		if(b==0 || a==0){
			throw new IllegalArgumentException("output is undefined or 0");
		}
	
		int number1 = (a%b);
		int number2 = (b%a);
		
	if(number1 == 0 || number2==0){
		return true;
	}else{
		return false;
		}
	// takes in two integers and returns a boolean to see if the two numbers are divisible by another
	}

	public static double absValue(double a){
		if (a==0){
			return 0;		
		}
		if (a>0){
			return(a);
		}
		else return(a*-1);
		// takes in a double and returns its absolute value 
	}
		
	public static int max(int a, int b){
		if (a==b){
		throw new IllegalArgumentException("numbers are equal");
		}
		if (a>b){
			return(a);
		}
		else{
			return(b);
		}
		// takes in two integers and returns the maximum of the two integers
	}
	
	public static double max(double a, double b, double c){
		if (a>b && a>c){
			return(a);
		}
		else if (b>a && b>c){
			return(b);
		} 
		else return(c);
		// takes in 3 doubles and returns the maximum of the 3 doubles 
	}
	
	public static int min(int a, int b){
		if (a==b){
			throw new IllegalArgumentException("numbers are equal");
		}
		if (a<b){
			return(a);
		}
		if (a>b){
			return(b);
		}
		else return -1;
		// takes in 2 integers and returns the minimum of the 2 integers 
	}
	
	public static double round2(double input){
		int number = ((int)(input * 100));
		
		 if ((input * 100)-number >= .5){
			 double result = ((int)(input*100)+1)/(double)100;
			 return result;		
		 }
		 
		 else {
			 double result = (int)(input*100)/((double)100);
			 return result;
		 }
	}	// takes in a double and returns it to the nearest tenth decimal place

	public static double exponent(double base, int power){
		if (base<0){
			throw new IllegalArgumentException("base is a negative number");
	}
		if (power<0){
			throw new IllegalArgumentException("exponent is a negative number");
		}
		if (power ==0){
			return 1.0;
		}
		double result= base;
		for(int i=1; i<power; i++){
			result*=base;
		}
		return result; 
		// takes in a double as the base and an integer as the power; raises the base to that power and returns the result
	}
	
	public static int factorial(int n){
		if (n<=0){
			throw new IllegalArgumentException("number is negative or 0");
		}
		int product=1;
			for(int i=2; i<=n; i++){
				product= product*i;
			}
			return product;
			// takes in an integer and finds the factorial of that integer  
	}

	public static boolean isPrime(int a){
		if (a<2){
			return false;
		}
		if (a==2){
			return true;
		}
		for (int i=3;i<a; i++){
			if (Calculate.isDivisibleBy(a, i)){
				return false;
			}
		}
		return true;
		// takes in an integer and returns a boolean to see if the integer is a prime number or not
	}
	
	public static int gcf(int a,int b){
		int smallnumber= Calculate.min(a, b);
		int bignumber= Calculate.max(a, b);
		int possiblefactor = smallnumber;
		while(possiblefactor>=2)
		{
			if (a==0 && b==0){
				return 0;
			}
			if (Calculate.isDivisibleBy(smallnumber, possiblefactor)){
				if (Calculate.isDivisibleBy(bignumber, possiblefactor)){
					return possiblefactor; 
				}
			}
			possiblefactor--;	
		}
		return -1;
		// returns the greatest common factor of the two accepted integers 
	}
	
	public static double sqrt(double a){
		
		if(a<0){
			throw new IllegalArgumentException("Squareroot of negative number is undefined");
		}
		
		if (a>=0){
			return (Math.sqrt(a));
		}
		else return -1.0;	
		// takes in a double and returns the square root of that double
	}

	public static String quadForm(int a, int b, int c){
		if (Calculate.discriminant(a,b,c) <0){
			return "no real roots";
		}
		
		double root1= Calculate.round2((-b + Calculate.sqrt(Calculate.discriminant(a, b, c)))/(2*a));
		double root2= Calculate.round2((-b - Calculate.sqrt(Calculate.discriminant(a, b, c)))/(2*a));
		if (Calculate.square(b) - 4*a*c==0){
			root1 = Calculate.round2(-b /(2*a));
			return ("Both roots are " + root1);
		}
		else {
			if (root1 > root2){
				return (root2 + "and " + root1);
			} else {
				return (root1 + "and "+ root2);
			}
		}
// takes in 3 integers, which are the coefficients of a standard form quadratic equation and returns its zeroes 
	}
}
