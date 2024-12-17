package exceptionhandling;
import java.util.Scanner;
public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a, b");
		int a = scanner.nextInt(); // java.util.InputMismatchException
		int b = scanner.nextInt(); //  same
		
		System.out.println("Result: "+ (a/b)); // ArithmeticException
		
		int[] arr = new int[5]; // array => default values => 0 0 0 0 0
		System.out.println(arr.length);
		System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
		
		String s = null;
		System.out.println(s.length()); // NullPointerException ==> crashed
		
		System.out.println("Enter a String"); 
		String x = scanner.next();
		int y = Integer.parseInt(x); // NumberFormatException
		
		System.out.println(y);
	}
}
