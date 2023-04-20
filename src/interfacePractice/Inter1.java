package interfacePractice;

public interface Inter1 {
	
	int i =20;
	int j = 15;
	
	void m1();
	void m2();
	
	// Inter1(){       interface cannot have constructors
		
	// }
	
	static void m6() {
		System.out.println("static method in interface");
	}
	
	public static void main(String[] args) {
		Inter1.m6();
	}

}
