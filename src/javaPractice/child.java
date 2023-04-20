package javaPractice;

public class child extends parent {
	
	public void m1() {
		System.out.println("child class method overriden");
	}
	
	public void m2() {
		System.out.println("parent class method");
	}

	public static void main(String[] args) {
		
		parent ref = new child();     // we can call all methods from parent class but only those methods of child class which are overridden
		ref.m1();
		ref.m1(0);
		
		// ref.m2();  m2() isn't overridden
		
		
	}

}
