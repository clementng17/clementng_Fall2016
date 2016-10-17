
public class StringExplorer {

	public static void main(String[] args) {
		String sample = "The quick brown fox jumped over the lazy dog.";

		// Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println("sample.indexOf(\"quick\") = " + position);
		int notFoundPsn= sample.indexOf("slow");
		System.out.println("sample.indexOf(\"slow\")=" + notFoundPsn);
		//indexOf(String str, int fromIndex) is different because it takes in two things: a string and an integer 
		
		// Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println("sample.toLowerCase() = " + lowerCase);
		System.out.println("After toLowerCase(), sample = " + sample);

		// Try other methods here:

	}

}