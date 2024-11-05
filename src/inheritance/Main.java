package inheritance;

public class Main {

	public static void main(String[] args) {
     
		Employee e1 = new Employee(123, "ABC",100000);
		//e1.setEmployee(123, "ABC",100000);
		e1.dispEmployee();
		e1.calSalary();
		
		
		TechEmp te1 = new TechEmp(321, "XYZ", 100000, 15000);  // object => eid = 0, ename = null
		//te1.setEmployee(321, "XYZ", 100000);
		te1.dispEmployee(); // overriden - print bonus
		te1.calSalary(); // overriden - includes bonus
		//System.out.println("Bonus: "+te1.getBonus());
	}

}
