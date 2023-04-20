package javaPractice;

public class loop {
	
	int a = 10;
	static int b =15;
	 

	public void test() {
		int c = 45;
		System.out.println(c + a);
		 System.out.println("Hi I am Tushar");
		 System.out.println(a+b);
	 }
	
	public static void demo() {
		
		loop ref = new loop();
		System.out.println(ref.a);
		System.out.println(b);
		
	}
	
	
	public static void main(String[] arg) {
		
		loop ref = new loop();
		ref.test();
		demo();
		System.out.println(b+ ref.a);
		
		
		
	}

}
