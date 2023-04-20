package javaPractice;

public class child1  extends parent1{
	
	public static void m1() {
		System.out.println("child class static method");
	}

	public static void main(String[] args) {
		
		parent1 ref =	new child1();
		
		ref.m1();  // parent static method will get execute
		
		
		child1 ref1 =	new child1();
		ref1.m1();   // child static method will get execute
		
		

	}

}
