package abstraction;
public class Person implements Cloneable{  // marker interface
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Person p1 = new Person("ABC", 20);
		System.out.println(p1);
		
		Person p2 = (Person) p1.clone();
		System.out.println(p2);
	}

}
