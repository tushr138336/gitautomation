package javaPractice;

public class ForLoop {

	public static void main(String[] args) {
		
		//for loop
		
		for(int i =0; i<=5 ; i++) {
			System.out.println(i);
		}
		
		// pattern inverse triangle
		
		for(int i = 5; i>=0 ; i--) {
			
			for (int j = i; j>=0 ; j--) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		// break keyword in java // used to break the loop when condition satisfied
		
		for(int i = 0; i <= 6 ; i++) {
			
			if(i==4) {
				break;
			}
						
			System.out.println(i);
			 
			
		}
		
		// continue keyword , used to jump and skip one iteration when condition is satisfied & continue with further iterations
		
		for(int i = 0; i <= 6 ; i++) {
					
					if(i==4) {
						continue;
					}
								
					System.out.println("Value of i is : " + i);		 
					
				}
		
		

	}

}
