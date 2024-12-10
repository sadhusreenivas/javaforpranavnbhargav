package nestedclasses;

@FunctionalInterface  // only one abstract method => SAM
public interface Printable {
	void print();
	
	public static void main(String[] args) {
		// Anonymous Inner Class
		
//		Printable p = new Printable() {  // anonymous object
//			public void print() {
//				System.out.println("Printing....");
//			}
//	    };
//	    
//	    p. print();
		
	    // lambda expression
		Printable p = () -> System.out.println("Printing....");
		p.print();
	    
}
}

// lamda expression