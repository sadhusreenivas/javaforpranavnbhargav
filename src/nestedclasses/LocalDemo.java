package nestedclasses;

public class LocalDemo {  // outer
    private int data = 99;
	// local class => defined inside a method
	
    public void display() {
    	//local named class 
    	class Local {
    		public void msg() {
    			System.out.println(data);
    		}
    	} // local class end
    	
    	Local l = new Local();
    	l.msg();
    	
    } // method end
    
    public static void main(String[] args) {
		new LocalDemo().display();
	}
    
}
