package inheritance;

public class Test {

	public static void main(String[] args) {
		
		Person p1 = new Person("ABC", 21);
		p1.dispPerson();
		System.out.println("**********************");
		
		Student s1 = new Student("XYZ",18,8.9,"CS");
		s1.dispPerson(); // overridden method
		System.out.println("**********************");
		
		
		p1 = s1; // upcasting
		p1.dispPerson(); // RTP
		System.out.println("**********************");

		
		Person p = new Student("Susan",21,9.1,"EC"); // upcasting
		p.dispPerson(); // overridden method => RTP

	}

}
