package venkat.strings;

public class StringToFloat {
	public static void main(String[] args) {
		// Input string
		String str = "100";

		// Returning the float value
		// represented by the string argument
		float val = Float.parseFloat(str);
		int i = Integer.parseInt(str);
		System.out.println(i);
		// Prints the float value of the string
		System.out.println("String is converted to float " + val);
	}
}