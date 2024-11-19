package nestedclasses;

public class Outer {
	private int data = 99;
	
	// member inner class
	class Inner { 
		public void disp() {
			System.out.println(data); // outer class accessing private data
		}
	} // end of inner
	
	public void someMethod() {
		Inner in = new Inner();
		in.disp();
	}
	
    public static void main(String[] args) {
    	
		Outer out = new Outer();
//		Outer.Inner in = out.new Inner(); // inner object
//		in.disp();
		out.someMethod(); //
		
		
	}
}
