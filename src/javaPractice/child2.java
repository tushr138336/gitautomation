package javaPractice;

public class child2 extends parent2 {
	

	public static void marry() {
		System.out.println("child marry method");
	}
	
	public  void marry1() {
		System.out.println("child marry1 method");
	}
	
	public  void marry1(String ref, int b) {
		System.out.println("child marry1 method string int ");
	}
	
	public  void marry1(int b, String ref) {
		System.out.println("child marry1 method int string");
	}
	

	public int marry2() {
		int b = 10;
		System.out.println(b);
		return b;
	}

	public static void main(String[] args) {
		child2 ref = new child2();
		//ref.marry();
	//	marry();
		ref.marry1();
		ref.marry1("qwe",11);
		ref.marry1(11, "ert");
	//	parent2.marry();
		
		parent2	ob1 = new parent2();
		ob1.marry1();
		//ob1.marry();
		
		parent2	ob =  new child2();
		parent2.marry();
		ob.marry1();
		
	}

}
