package Practice;

public class PyramidPatterns {

	public static void main(String[] args) {

//		Right Half Pyramid Pattern

		/*
		 * for(int i =0; i<=5; i++) { for (int j =0; j<=i; j++) { System.out.print("*");
		 * } System.out.println(); }
		 */

//		Right half Pyramid Pattern Inverted

		/*
		 * for (int i=5; i>=0; i--) { for (int j=0; j<=i; j++) { System.out.print("*");
		 * } System.out.println(); }
		 */

		// Left half pyramid pattern
		
	/*	for (int i = 1; i <= 5; i++) { // 1 2
			for (int j = 5-i; j>0; j--) { // 1,2,3,4 1,2,3
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) { // 1, 1,2
				System.out.print("*");
			}
			System.out.println();
		}
	*/
		
		// Left half Pyramid Pattern Inverted
		
	/*	for(int i= 5; i>0; i--) {              //5             4          3         2         1
			for(int j=5-i; j>=0; j--) {        //0,            1,0        2,1,0     3,2,1,0   4,3,2,1,0
				System.out.print(" "); 
			} 
			for (int k=1; k<=i; k++) {         //1,2,3,4,5      1,2,3,4   1,2,3     1,2        1
				System.out.print("*");
			}
			System.out.println();
		}
	*/
		
/*		// Right side Triangle Pattern 
		
		for (int i = 1; i<= 5; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print("* ");
			}			
			
			System.out.println();
			
		}
		for (int i =1; i<=5; i++) {
			for(int j =5; j>=i; j--){
				System.out.print("* ");
			}
			
			System.out.println();

		}
	*/
	/*	// Left side triangle pattern
		
		for (int i = 1; i <= 5; i++) {
		    for (int j = 5 - i; j > 0; j--) {
		        System.out.print(" ");
		    }
		    for (int k = 1; k <= i; k++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}

		for (int i = 4; i > 0; i--) {
		    for (int j = 4; j >=i; j--) {
		        System.out.print(" ");
		    }
		    for (int k = 1; k <= i; k++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
	*/	
	
/*		//Triangular Pattern
		
		for (int i =1; i<=5; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	*/
		// Pyramid Star Pattern first method
		
//		for(int i=1; i<=5; i++) {
//			for (int j =4; j >=i; j--) {
//				System.out.print(" ");
//			}
//			for(int k=1; k<(i*2); k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//Pyramid Star Pattern second method
		
	/*	for(int i=1;i<=5;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");	
			}
			for (int l=2;l<=i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
	/*	//Reverse pyramid pattern
		
		for(int i =5; i>=1;i--) {
			for(int j=5; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<(i*2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
	/*	//diagonal star pattern
		
		for(int i =1; i<=5; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			
			}
			System.out.print("*");
			System.out.println();
		}
		*/
		
		//Reverse diagonal star pattern
		
		for (int i=1;i<=5;i++) {
			for (int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
	
		
		
	}

}
