import java.io.*;
import java.util.Scanner;

public class SlideProblemTemperature {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(new File("src/temperature.txt"));		
		double difference=0.0;
		double firstTemperature=0.0;
		double storeTemperature=0.0;
		firstTemperature = input.nextDouble();
		storeTemperature = firstTemperature;
		while (input.hasNextDouble()){ 
			firstTemperature = input.nextDouble(); 
			difference = firstTemperature - storeTemperature;
			System.out.println(storeTemperature + " to " + firstTemperature + ", change = " + round2(difference));
			storeTemperature = firstTemperature;
		}
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
	}

}
