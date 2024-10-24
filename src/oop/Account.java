package oop;

public class Account {

	private int accNo;
	private String accType;
	private double balance;

	public Account(int accNo, String accType, double balance) {
		super();
		this.accNo = accNo;
		this.accType = accType;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return 	accNo+" "+accType+" "+balance;
	}
	
	public void calInterest() {
		double si = balance*3.5*8.5;
		System.out.println("Interest earned is: "+si);
	}

}
