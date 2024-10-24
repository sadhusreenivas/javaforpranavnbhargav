package oop;
public class Student {  // classes, methods - public
	 int rno; // instance
	 String name; // instance
	 double gpa; // instance
	 static String school = "MIT"; // class
	 
	 // 1. setter is eliminated by cons
	public Student(int rno, String name, double gpa) {  // parameterized
		this.rno = rno;
		this.name = name;
		this.gpa = gpa;
	}
	 
//	public void getStudent() {
//		System.out.println(rno+" "+name+" "+gpa+" "+school);
//	}
	// getter is eliminated by toString
	// redefining the method behavior
	public String toString() {
        return rno+" "+name+" "+gpa+" "+school;
    }


}
