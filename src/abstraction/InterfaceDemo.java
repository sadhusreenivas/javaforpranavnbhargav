package abstraction;

public class InterfaceDemo implements Printable, Showable{ //// multiple inheritance

	@Override
	public void show() {
			System.out.println("Displays......");	
	}

	@Override
	public void print() {
		System.out.println("Printing.....");
	} 
	
	public static void main(String[] args) {
		
		InterfaceDemo i1 = new InterfaceDemo();
		i1.print();
		i1.show();
	}
}

// multiple inheritance - a class extending from multiple classes
// Not supported in Java 
// extends -> only single class

// MI - interfaces is supported
// implements => many interfaces