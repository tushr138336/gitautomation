package javaPractice;

public class InheritanceChild extends InheritanceParent {

	public InheritanceChild() {
		super(20);			// we have to specifically call it otherwise error is shown
		System.out.println("Child class constructor");
	}

	public static void main(String[] args) {
		
		InheritanceChild ref = 	new InheritanceChild();
		
		
	}

}
