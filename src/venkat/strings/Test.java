package venkat.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test{  
    public static void main(String[] args) {  
    	List<String> names =
	          Arrays.asList("Jai", "Naren", "Nidhi",
	             "Nidhi", "Naren", "Nidhi");
 
	      Map<String, Long> map =
	      names.stream().collect(
	          Collectors.groupingBy(
	             Function.identity(), Collectors.counting()
	          )
	      );
 
	      System.out.println(map);
    }  
}