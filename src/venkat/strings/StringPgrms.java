package venkat.strings;

public class StringPgrms {
	public static void main(String[] args) {

		String reverse="venkat";
		String s=" ";
		
		for(int i=reverse.length()-1;i>=0;i--) {
			s=s+reverse.charAt(i);
		}
		System.out.println(s);
	}
}
