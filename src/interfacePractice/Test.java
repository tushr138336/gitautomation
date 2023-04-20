package interfacePractice;

public class Test implements Inter1, Inter2 {
	
	 public void m1() {  // needs to complete only once for both interfaces
		System.out.println("method m1");
	}
	 
	 public void m2() {
		 System.out.println("method m2");

		}
	 
	 public void m3() {
		 System.out.println("method m3");

		}
	 
	 public void m4() {
		 System.out.println("method m4");

		}
	 
	 public void m5() {
		 System.out.println("method m5");
	 }
	
	

	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		t.m2();
		t.m3();
		t.m4();
		t.m5();
		// System.out.println(t.i);  ambiguity problem
		System.out.println(t.j); 
		System.out.println(t.x); 
		
		Inter1 ref = new Test();
		ref.m1();
		ref.m2();
		System.out.println(ref.i);
		System.out.println(ref.j);
		
		Inter2 ref2 = new Test();
		
		ref2.m1();
		ref2.m3();
		ref2.m4();
		System.out.println(ref2.i);
		System.out.println(ref2.x);
		
	}

}
