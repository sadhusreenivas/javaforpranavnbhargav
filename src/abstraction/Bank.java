package abstraction;

public class Bank implements RBI {

	@Override
	public void withdraw() {
		System.out.println("withdraw success and cashback earned: "+ cashback);
	}

	@Override
	public void transfer() {
		System.out.println("Transfer success");
	}

	@Override
	public void chkBalance() {
		System.out.println("Balance is so and so....");
	}
	
	@Override
	public void confirmTransaction() {
		System.out.println("Transaction confirmed!");
	}

	// own methods
	public void disp() {
		System.out.println("I am a Bank");
	}
	
	public static void main(String[] args) {
		
		RBI rbi = new Bank(); // upcasting
		rbi.chkBalance();
		rbi.transfer();
		rbi.withdraw();
		rbi.confirmTransaction();
		
		new Bank().disp();
	}

	
}
