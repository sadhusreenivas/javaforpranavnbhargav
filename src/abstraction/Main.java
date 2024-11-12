package abstraction;

public class Main {

	public static void main(String[] args) {
		
		// A a1 = new A();  abstract classes can not be instantiated
		// B b1 = new B(); //
		
		A a1 = new B(); // upcasting
		
		a1.sayHello();
		a1.sayBye();
		
		a1.greet(); // 
		
		//a1.disp(); // not possible - child specific
		 new B().disp();  // anonymous object
		
	}
}
