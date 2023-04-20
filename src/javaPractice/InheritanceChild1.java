package javaPractice;

public class InheritanceChild1 {
	
	public InheritanceChild1(int a) {
		
			System.out.println("Child class constructor");
	}

	public static void main(String[] args) {
		
		 InheritanceChild1 ref = new  InheritanceChild1(20);    // it will not call parent class constructor bcz constructor does not follow inheritance principle by default

	}

}
