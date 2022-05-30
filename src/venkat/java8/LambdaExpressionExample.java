package venkat.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionExample {
	  public static void main(String args[]){
		List<String> list=new ArrayList<String>();  
	        list.add("Jai");  
	        list.add("Vivek");  
	        list.add("Mahesh");  
	        list.add("Vishal");  
	        list.add("Naren");  
	        list.add("Hemant");  
	        list.add("Vikas"); 
	        list.add("Ajay"); 
	         
	        Collections.reverse(list);
	        System.out.println(list);
	        list.forEach(  
	            (name)->System.out.println(name)  
	        );  
	  }
}