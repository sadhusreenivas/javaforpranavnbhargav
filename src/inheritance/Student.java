package inheritance;

public class Student extends Person{
	
	private double gpa;
	private String course;
	
	public Student(String name, int age, double gpa, String course) {
		super(name, age); // refer to parent's constructor
		this.gpa = gpa;
		this.course = course;
	}
	
	// re-define 
	@Override
	public void dispPerson() {
		super.dispPerson(); // name and age
		System.out.println(gpa+" "+course);
	}
	
}
