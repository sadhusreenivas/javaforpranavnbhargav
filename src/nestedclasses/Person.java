package nestedclasses;

public class Person {

	public void eat() {
		System.out.println("Eats carbs!");
	}
	
	public void speak() {
		System.out.println("Speaks Telugu");
	}
	
	public static void main(String[] args) {
		// AIC
		Person p1 = new Person() {  // AIC extends / implements parent type
			@Override
			public void eat() {
				System.out.println("Eats Proteins!");
			}  
		};
		p1.eat();
		p1.speak();
		
	}
}
