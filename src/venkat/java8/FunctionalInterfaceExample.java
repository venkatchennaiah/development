package venkat.java8;

@FunctionalInterface
interface AddInterface {
	void add(int a, int b);
}

public class FunctionalInterfaceExample {

	public static void main(String args[]) {
//		AddInterface addInterface = new AddInterface() {
//			public void add(int a, int b) {
//				System.out.println(a + b);
//			}
//		};
//		addInterface.add(10, 20);
		AddInterface addInterface=(a, b)->{
			 System.out.println(a + b);				 
		};
		addInterface.add(10, 20);  
	}
}