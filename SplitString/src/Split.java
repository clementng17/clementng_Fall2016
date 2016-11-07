
public class Split 
{

	public static void main(String[] args) {
		
		

		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples"split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
		
		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
		System.out.println(Arrays.toString(“I reallyreally like apples!” .split(“really“)));
		
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
			public static void Bread(String statement){
				String separate = “bread”;
				String[] toppings = statement.split(“bread”);
				if ( toppings.length > 3){
					for (int i = 0; i <toppings.length-2; i++){
						System.out.println(toppings[1+i]);
					}
				}else {
					System.out.println(toppings[1]);
				}
		
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/
			public static void Bread2(String recipe){
				String separate = "bread";
				String[ ] toppintgs =recipe.split("bread");
				String ingredients = "null";
				if (toppings.length<0){
					System.out.println("Toppings not surrounded by bread.");
				}
				else if (toppings.length>2){
					for (int i =0; i <toppings.length-2; i++){
						ingredients =toppings[i+1].split(" ");
						if (Arrays.toString(toppings)== "[]"){
							System.out.print("Toppings not surrounded by bread.");
						}
						else { System.out.println(Arrays.toString(toppings));
		
						}
					}
				}
				else { System.out.print("Toppings not surrounded by bread.");
	}

}
