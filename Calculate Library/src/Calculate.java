
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
		return((number2*number2)-4*number1*number3);
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
	}

	public static double absValue(double a){
		if (a==0){
			return 0;		
		}
		if (a>0){
			return(a);
		}
		else return(a*-1);
	}
		
	public static int max1(int a, int b){
		if (a==b){
		throw new IllegalArgumentException("numbers are equal");
		}
		if (a>b){
			return(a);
		}
		else return(b);
	}
	
	public static double max2(double a, double b, double c){
		if (a>b && a>c){
			return(a);
		}
		if (b>a && b>c){
			return(b);
		}
		else return(c);
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
	}
	
	public static double round2(double a){
		return (a*100.0/100.0);
	}
	
	public static double exponent(double base, int power){
		if (base<0){
			throw new IllegalArgumentException("base is a negative number");
	}
		if (power<0){
			throw new IllegalArgumentException("base is a negative number");
		}
		int result=1;
		for(int i=power; i>0; i--){
			result*=base;
		}
		return result;
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
	
	public static int gcf(int a,int b){
		int smallnumber= Calculate.min(a, b);
		int bignumber= Calculate.max1(a, b);
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
	}
	
	public static double sqrt(double a){
		if(a<0){
			throw new IllegalArgumentException();
		}
		if (a>=0){
			return (Math.sqrt(a));
		}
		else return -1.0;	
	}

	public static String quadForm(int a, int b, int c){
		if (square(b)- 4*a*c<0){
			return "no real roots";
		}
		double root1= ((-b + sqrt(discriminant(a, b, c)))/2);
		double root2= ((-b - sqrt(discriminant(a,b,c)))/2);
		if (sqrt(square(b) + 4*a*c)>=0){
			double newroot1= root1*100/100.0;
			double newroot2= root2*100/100.0;
		return (newroot1 + "and" + " "+ newroot2);
	}
	return ("-1");
	}
}
