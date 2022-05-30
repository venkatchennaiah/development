package venkat.strings;

//Java code to demonstrate the
//working of replaceAll()
public class rep2 {
	public static void main(String args[]) {

		// Initialising String
		String Str = new String("Welcome to geeksforgeeks");

		// original string
		System.out.print("Original String : ");
		System.out.println(Str);

		// Using replaceAll to replace regex with replace_str
		System.out.print("After replacing regex with replace_str : ");
		System.out.println(Str.replaceAll("(.*)geeks(.*)", "AKSHIT SAXENA"));

	}
}
