package inheritance;

public class Employee {

	private int eid;
	private String ename;
	
	public void setEmployee(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}
	
	public void dispEmployee() {
		System.out.println(eid+" "+ename);
	}
}
