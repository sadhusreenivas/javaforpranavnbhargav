package stringhandling;

public class StringComp {

	public static void main(String[] args) {
		
		String s1 = new String("India");// 2
		String s2 = new String("USA"); // 2
		String s3 = "India"; // 0
		String s4 = "USA"; // 0
		String s5 = "Bharat"; //1
		String s6 = "BHARAT"; // 1
		
		System.out.println(s1.equals(s3)); // true
		System.out.println(s2.compareTo(s4)); // 0
		System.out.println(s5.equalsIgnoreCase(s6)); //true
		System.out.println(s1 == s3); // false
		System.out.println(s1.compareTo(s5)); // +7
		System.out.println(s5.compareTo(s1)); // -7
		
		System.out.println(s6.length());//6
		System.out.println(s6.charAt(3)); // R
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.substring(1)); //ndia
		System.out.println(s1.substring(1, 4));//ndi

	}

}
