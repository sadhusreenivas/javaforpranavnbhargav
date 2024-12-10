package nestedclasses;

public class TopLevel {

	private static int data = 99;
	
	static class A{  // it can access only static members of outer class
		static void disp() {
			System.out.println(data);
		}
	}
	
	public static void main(String[] args) {
		
//		TopLevel.A a1 = new TopLevel.A();
//		a1.disp();
		
		TopLevel.A.disp();
	}
}
