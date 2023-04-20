package javaPractice;

public class ConstPractice {
	
	int m;
	int s;
	int e;
	
	//usage1 = to initialize data members
	
	public ConstPractice(int mm,int ss,int ee) {  
		
		this.m = mm;
		this.s = ss;
		this.e = ee;		
	}
	
	// usage2 = calling of one constructor in another
	
	public ConstPractice(int m,int s, boolean b) {
		
		System.out.println("three argument constructor");
			
	}
	
	public ConstPractice(int m,int s) {
		this(14,15,true);
		System.out.println("Two argument constructor");
	}
	
	public ConstPractice(int m) {
		this(12,13);
		System.out.println("One argument constructor");
	}
	
	public ConstPractice() {
		this(30);
		System.out.println("Zero argument constructor");
	}

	public static void main(String[] args) {
	
		ConstPractice cp = new ConstPractice(10,20,30);
		ConstPractice cp1 = new ConstPractice(56,57,58);
		
		System.out.println(cp.m);
		System.out.println(cp.s);
		System.out.println(cp.e);
		
		System.out.println(cp1.m);
		System.out.println(cp1.s);
		System.out.println(cp1.e);
		
		ConstPractice ref = new ConstPractice();
		System.out.println(ref);

	}

}
