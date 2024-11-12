package abstraction;

public class SBI extends ATM{
	
	public SBI(int cashback) {
		super(cashback);
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw success and you got cashback: "+getCashback());
	}

	@Override
	public void transfer() {
		System.out.println("Transfer success and you got cashback: "+getCashback());
	}

    @Override
	public void disp() {
		super.disp();
		System.out.println("I am SBI");
	}

	public static void main(String[] args) {
		
		ATM atm = new SBI(10);
		atm.withdraw();
		atm.transfer();
		atm.disp(); // overridden => RTP
		 
		
	}
}
