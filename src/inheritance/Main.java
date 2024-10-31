package inheritance;

public class Main {

	public static void main(String[] args) {
     
		Employee e1 = new Employee();
		e1.setEmployee(123, "ABC");
		e1.dispEmployee();
		
		TechEmp te1 = new TechEmp();
		te1.setEmployee(321, "XYZ");
		te1.dispEmployee();
		
	}

}
