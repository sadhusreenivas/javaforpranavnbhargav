package demo;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
    	
    	System.out.println(System.currentTimeMillis());
    	long t1 = System.currentTimeMillis();
        Set<String> result = Stream.of("John", "George", "Joe", "Sue", "James")
            .filter(name -> name.startsWith("J")) // Filter names starting with "J"
            .map(String::toUpperCase)             // Convert names to uppercase
            .skip(1)                               // Skip one name
            .collect(Collectors.toSet());          // Collect into a Set

        System.out.println(result);
        System.out.println(System.currentTimeMillis());
        long t2 = System.currentTimeMillis();
        
        System.out.println("Time in milli sec: "+ (t2-t1));
        
        
        
    }
}