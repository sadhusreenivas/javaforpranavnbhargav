package stringhandling;

public class StringDemo {

	public static void main(String[] args) {
		
		
		String lang = "Java"; // SCP
		lang.concat(" 23"); // appending ==> SCP => Java 23
		System.out.println(lang); // Java => immutable
		
		
		StringBuffer sb = new StringBuffer("Hello"); // mutable
		sb.append(" Java");
		System.out.println(sb); //
		
		StringBuilder sb1 = new StringBuilder("Hello"); //mutable
		sb1.append(" Python");
		System.out.println(sb1);
		//int x = 123;
		
		System.out.println("Hello"+ 123);
		System.out.println(20+40+"hello"+20+20);
		
		
		String n = "Virat";
		System.out.println(n+" Kohli"); // +
		
		System.out.println(new StringBuilder().append(n).append(" Kohli").toString());
		
		String s1 ="Welcome";
		String s2 ="Java";
		
		String s = s1 + s2;  // new StringBuffer().append(s1).append(s2).toString();
		System.out.println(s);
		

	}

}
