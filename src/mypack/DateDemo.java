package mypack;

//import java.util.Date; // explicit  => priority
//import java.util.Scanner; 
//import java.sql.*; // implicit

public class DateDemo {

	public static void main(String[] args) {
		
		java.util.Date d = new java.util.Date();
		System.out.println(d); // d.toString()
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter name");
		String name = scanner.nextLine();
		
		System.out.println(name);

	}

}
