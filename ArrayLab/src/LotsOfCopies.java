import java.util.*;
public class LotsOfCopies {
	/*
	public static void main(String[ ] args){
		int num= 7;
		String strMain =  "APCS";
		int[] arrMain = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arrMain));
	}
	 * 
	 */
	public static void changeMe (int x, String str, int[ ] arr){
		x = 1;
		int b = 2;
		x = b;
		System.out.println(x);
		int[] Array1 = {1, 2, 3, 4, 5};
		int[] Array2 =  {2, 3, 4, 5, 6};
		Array1 = Array2;
		System.out.println(Arrays.toString(Array1));
	}
}
