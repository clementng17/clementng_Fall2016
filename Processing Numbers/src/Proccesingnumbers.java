
	import java.util.*;

	public class Proccesingnumbers {
		
		public static void main(String[] args) {
			Scanner UserInput = new Scanner (System.in);
			int max = 0;
			int min = 0;
			int number= 0;
			int sum = 0;
			int input = UserInput.nextInt();
			
			for (int n =1; n<= input; n++){
				number = UserInput.nextInt();
				if (n == 1){
					min = number;
				}
				if (number < min){
						number = min;
				}
				if ( number > max){
						number = max;
				}	
			}
			System.out.println("The smallest number is " + min);
			System.out.println("The largest number is " + max);

			if ( input%2 == 0){
				input += input;
				input=  sum;
				System.out.println("The sum of all even numbers is " + sum);
			}
			
			
	}
		
	}