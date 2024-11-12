package abstraction;
public class B extends A{
	@Override
	public void sayHello() {
		System.out.println("Hi..welcome home");
	}

	@Override
	public void sayBye() {
		System.out.println("Bye...see you again!");
	}

	// inheritance => greet
	@Override
	public void greet() {
    super.greet();
    System.out.println("Vanakkam!");
	}
   
	// child specific method
	public void disp() {
		System.out.println("Hello..I am class B");
	}
}
