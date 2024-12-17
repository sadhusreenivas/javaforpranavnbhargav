package exceptionhandling;

import java.io.*;
public class BRDemo {

	public static void main(String[] args) throws IOException {
	
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 System.out.println("Enter Name");
		 String name = br.readLine();
		 
		 System.out.println("Enter Age");
		 int age = Integer.parseInt(br.readLine());  // NFE
		 
		 System.out.println(name+" "+age);

	}

}
