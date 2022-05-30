package venkat.strings;

public class StringSpaceChars {
	static void getChar(String str) {

		// Traverse the string using for loop
		for (int i = 0; i < str.length(); i++) {

			// Printing the current character
			System.out.print(str.charAt(i));

			// Printing a space after each letter
			System.out.print(" ");
		}
	}

	public static void main(String[] args) {
		String s = "venkat";
		getChar(s);

	}

}
