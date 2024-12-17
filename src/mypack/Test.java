package mypack;

import static java.lang.Math.*; // static import
import us.mas.andover.B; // explicit 

public class Test {
	public static void main(String[] args) {
		
		B b1 = new B(100);
		System.out.println(b1.getB());
		
		in.hyd.A a1 = new in.hyd.A(99);
		System.out.println(a1.getA());
		
		double rn = random(); // 0.0 - 0.9
		System.out.println(rn);
	}
}
