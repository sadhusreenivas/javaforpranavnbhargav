package inheritance;
public class Employee { // fully encapsulation
	private int eid;
	private String ename;
	//private double pay;
	protected double pay; // it is available in child classes
	private static String org = "Google";
	
	// setter can be replaced with cons
	public Employee(int eid, String ename, double pay) {
		this.eid = eid;
		this.ename = ename;
		this.pay = pay;
	}
	
	public void dispEmployee() {
		System.out.println(eid+" "+ename+" "+pay+" "+org);
	}
	
	public void calSalary() {
		// da = 53%, hra = 30%, ta = 10%
		double salary = pay + pay * (0.53+0.3+0.1);
		System.out.println("Salary: "+salary);
	}

	public double getPay() {
		return pay;
	}
	
	
}
