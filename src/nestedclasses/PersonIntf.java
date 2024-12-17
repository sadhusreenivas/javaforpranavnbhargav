package nestedclasses;

public interface PersonIntf {
	
	void eat();
	void speak();
	
	public static void main(String[] args) {
		
		PersonIntf p1 = new PersonIntf(){
			@Override
			public void eat() {
				System.out.println("Eating carbs");
			}

			@Override
			public void speak() {
				System.out.println("Eating Proteins");
			}
		};
		
		p1.eat();
		p1.speak();
	}

}