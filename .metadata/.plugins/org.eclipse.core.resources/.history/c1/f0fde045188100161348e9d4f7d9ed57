
public class Calculate {
	public static int square(int number){
		return(number*number);
	}
	
	public static int cube(int number){
		return(number*number*number);
	}

	public static double average(double number1, double number2){
		return((number1+number2)/2);
	}
	
	public static double average(double number1, double number2, double number3){
		return((number1+number2+number3)/3);
	}
	
	public static double toDegrees(double number){
		return(number*360/3.14159);
	}
	
	public static double toRadians(double number){
		return(number*3.14159/360);
	}
	public static double discriminant(double number1, double number2, double number3){
		return((number2*number2)-4*number1*number2);
	}
	
	public static int toImproperFrac(int a, int b, int c){
		int numerator=((a*b)-c);
		System.out.println(numerator+"/"+c );
		return numerator;
	}
	
	public static String toMixedNum(int number1, int number2){
		int wholenumber= number1/number2;
		int numerator=(number1%number2)- number2;
		return(wholenumber + "_" + numerator + "/" +number2);
	}
	
	public static String foil(int number1, int number2, int number3, int number4, int n){
		return(number1*number3 + "n^2"+ number1*number4+number2*number3 +"n" +number2*number4);
	}
	
	public static boolean isDivisibleBy(int a, int b){
		int number1 = (a/b);
		int number2 = (b/a);
		int newnumber = (number1+number2);
		
	if(newnumber == 0){
		return true;
	}else{
		return false;
		}
	}

	public static double absValue(double a){
		if (a>0){
			return(a);
		}
		else return(a*-1);
	}
		
	public static int max(int a, int b){
		if (a>b){
			return(a);
		}
		else return(b);
	}
	
	public static double max(double a, double b, double c){
		if (a>b && a>c){
			return(a);
		}
		if (b>a && b>c){
			return(b);
		}
		else return(c);
	}
	
	public static int min(int a, int b){
		if (a<b){
			return(a);
		}
		else return(b);
	}
	
	public static double round2(double a){
		return(a*100/100.0);
	}
	
	public static double exponent(double base, int power){
		for(int i=power; i>0; i++){
			return base*base;
		}
	}
	
	public static int factorial(int n){
		int product=1;
			for(int i=2; i<=n; i++){
				product= product*i;
			}
			return product;
			for (int i=0; i>=0; i++){
				System.out.println( i + "!=" + factorial(i));
			}
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
	}
	public static int gcf(int a, int b){
		int smallnumber= Calculate.min(a, b);
		int bignumber= Calculate.max(a, b);
		int possiblefactor= smallnumber;
		while(possiblefactor>=2)
		{
			if (a==0 && b==0){
				return 0;
			}
			if Calculate.isDivisbleBy(smallnumber, possiblefactor){
				if Calculate.isDivisibleBy(bignumber, possiblefactor){
					return possiblefactor; 
			}
			possiblefactor--;
			}
	}
	
	public static double sqrt(double a){
		if (a>=0){
			return (Math.sqrt(a));
		}
		else return -1.0;	
	}
	/*
	public static String quadForm(int a, int b, int c){
		return((-b + sqrt(discriminant(int a, int b, int c))/2);
		return((-b - sqrt(discriminant(int a, int b, int c))/2);
	}
*/
}
