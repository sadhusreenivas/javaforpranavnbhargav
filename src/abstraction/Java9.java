package abstraction;

public interface Java9 {
	
	void msg(); // abstract
	
	default void welcome() {
		System.out.println("Welcome to Java 9 features - default method");
		sayHi();
	}
	
	private void sayHi() {
		System.out.println("Hi");
	}
	
	public static void sayBye() {
		System.out.println("Bye");
		disp();
	}
	
	private static void disp() {
		System.out.println("Im private static method");
	}

}
