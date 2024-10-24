package oop;

public class CustomerMain {
	
	public static void main(String[] args) {
		
		Account acc = new Account(112233, "Savings", 100000);
		Address addr = new Address(114, "Dream Valley", "Hyd", 500089);
		
		Customer c1 = new Customer(12345, "ABC", acc, addr);
		System.out.println(c1); // acc, addr
		
		c1.getInterest(); // calInterest()
		acc.calInterest();
	}

}

// setter -> cons
// getter - toString()
// private 