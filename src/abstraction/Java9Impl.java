package abstraction;

public class Java9Impl implements Java9{

	@Override
	public void msg() {
		System.out.println("method implemented....");
	}
	
	public static void main(String[] args) {
		
		Java9Impl java9 = new Java9Impl();
		
		java9.msg();
		java9.welcome();// default -> pvt
		
		// calling static using interface name
		Java9.sayBye(); // pvt static
		
	}

}
