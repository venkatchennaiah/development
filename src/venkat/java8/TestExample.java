package venkat.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class TestExample {
	public static void main(String args[]) {
		List<Student> list = new ArrayList<Student>();

		// Adding Students
		list.add(new Student(1, "Nidhi", 25));
		list.add(new Student(3, "Parbhjot", 24));
		list.add(new Student(2, "Amani", 25));
		list.add(new Student(6, "Jai", 24));
		list.add(new Student(7, "Mahesh", 26));
		list.add(new Student(12, "Roxy", 25));
//		// Fetching student names as List
//		List<String> names = list.stream().map(n -> n.name).collect(Collectors.toList());
//		System.out.println(names);
//		
//		List<Student> al2=list.stream().sorted(Comparator.comparing(Student:: getName)).collect(Collectors.toList());	
//	      System.out.println(al2);
	      
		Stream<Student>	al2=list.stream().sorted(Comparator.comparing(Student ::getName ).reversed());
             
	}
}