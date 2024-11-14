package abstraction;

public interface RBI extends TTP {
	// constants
	int cashback = 10; // public final static int

	// abstract methods => public 
	void withdraw();
	void transfer();
	void chkBalance();
	
}


// inheritance exits among interfaces