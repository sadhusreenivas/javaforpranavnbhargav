package nestedclasses;

public abstract class Book {
	
	public abstract void read();
	public void getBookDetails() {
		System.out.println("Java");
	}
	
	public static void main(String[] args) {
		// AIC
		Book b1 = new Book() {
			@Override
			public void read() {
				System.out.println("Reading Book!");
			}
		};
		
		b1.read();
		b1.getBookDetails();
	}

}

