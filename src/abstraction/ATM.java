package abstraction;

public abstract class ATM {
     
	private int cashback; // data
	
	public ATM(int cashback) {   // cons
		this.cashback = cashback;
	}

	public abstract void withdraw();  // a m
	
	public abstract void transfer(); // a m
	
	public void disp() { // c m
		System.out.println("I am so and so ATM");
	}

	public int getCashback() {
		return cashback;
	}
	
	
}
