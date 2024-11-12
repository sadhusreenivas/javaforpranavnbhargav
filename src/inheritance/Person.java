package inheritance;

public class Person {  // java.lang.Object

	private String name;
	private int age;
	private static String country = "India";
	
	
	public Person(String name, int age) {
		//super();  // object class
		this.name = name;
		this.age = age;
	}
	
	public void dispPerson() {
		System.out.println(name+" "+age+" "+country);
	}
}
