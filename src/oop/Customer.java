package oop;
public class Customer {  // fully encapsulated class
	private int cid;
	private String cname;
	private static String bank = "XYZ";
	// Account
	Account account; // object reference
	// Address
	Address address; // object reference
	
	public Customer(int cid, String cname, Account account, Address address) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.account = account;
		this.address = address;
	}

	@Override
	public String toString() {
		return cid+" "+cname+" "+bank+"\n"+account+"\n"+address; 
		// account.toString()
		//address.toString()
	}
	
    public void getInterest() {
    	account.calInterest();
    }
	
}
