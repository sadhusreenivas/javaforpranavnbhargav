package inheritance;

public class TechEmp extends Employee { // re - usability
	// when parent has a cons written, child must have the explicit cons
	private int bonus; // final => final static

	public TechEmp(int eid, String ename, double pay, int bonus) {
		super(eid, ename, pay); // referring to immediate parent class cons
		this.bonus = bonus;
	}

//	public int getBonus() {
//		return bonus;
//	}

	// re-define calSalary => overriding
	@Override  // annotation  => compiler that this method belongs to parent class
	public void calSalary() {
		// da = 53%, hra = 30%, ta = 10%
		// double salary = getPay() + getPay() * (0.53+0.3+0.1) + bonus;
		double salary = pay + pay * (0.53 + 0.3 + 0.1) + bonus;
		System.out.println("Salary: " + salary);
	}

	// re-define dispEmployee()
	@Override // => compiler that this method belongs to parent class
	public void dispEmployee() {
		// System.out.println(eid+" "+ename+" "+pay+" "+org);
		super.dispEmployee(); // eid ename pay org
		System.out.println(bonus);
	}

}
