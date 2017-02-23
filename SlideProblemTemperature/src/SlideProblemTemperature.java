import java.io.*;
import java.util.Scanner;


public class SlideProblemTemperature {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(new File("src/weather.txt"));		
		double difference;
		double firstTemperature;
		double nextTemperature;
		firstTemperature = input.nextDouble();
		nextTemperature = firstTemperature;
		while (input.hasNextDouble()){ 
			firstTemperature = input.nextDouble(); 
			difference = firstTemperature - nextTemperature;
			System.out.println(nextTemperature + " to " + firstTemperature + ", change = " + round2(difference));
			nextTemperature = firstTemperature;
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
