package Practice;

public class HollowPatterns {

	public static void main(String[] args) {
		
	/*	//Hollow square pattern
          for (int i=1;i<=5; i++) {
        	  for (int j=1; j<=5; j++) {
        		  if (i==1 || j==5 ||i==5 ||j==1) {
        			  System.out.print("* ");
        		  }
        		  else {
        			  System.out.print("  ");
        		  }
        	  }
        	  System.out.println();
          }
          */
		
	/*	//Parallel line pattern
		
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=5;j++) {
				if(j==1 || j==5) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		*/
		
/*		// cross shape
		
		for (int i=1; i<=5; i++) {
			for (int j=1;j<=5;j++) {
				// if(i==j || j==5&&i==1 ||j==4&&i==2||j==2&&i==4||j==1&&i==5) {
				//OR 	
				 if(i==j||i+j==6){
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	*/	
		
 /*		//plus pattern
		for (int i=1; i<=5; i++) {
			for (int j=1;j<=5;j++) {
				if(i==3||j==3) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
	}
 */
	/*	//hollow right triangle
		for(int i=1; i<=5; i++) {
			for(int j=1;j<=i;j++) {
				if(j==1||i==5||i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		*/
		
	/*	//hollow left triangle
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				if(k==1||i==5||i==k) {
				System.out.print("* ");
			}
				else {
				System.out.print("  ");
				}
				}
			System.out.println();
		}
	*/	
	/*	// hollow pyramid
		for(int i=1;i<=5;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print("  ");
			}
			for(int k=1;k<(i*2);k++) {
				if(i==5||k==1||k==(i*2-1)) {
				System.out.print("* ");
			}
				else {
					System.out.print("  ");
				}
		}
			System.out.println();
		}
		*/
		
/*		//Reverse hollow pyramid
		for(int i=5;i>=0;i--) {
			for(int j=4;j>=i;j--) {
				System.out.print("  ");
			}
			for(int k=1;k<(i*2);k++) {
				if(i==5||k==1||k==(i*2-1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	*/
	/*	//Hollow Diamond pattern
		
		for(int i=1;i<=5;i++) {
			for(int j=4; j>=i;j--) {
				System.out.print(" ");
			}
			for(int k =1;k<(i*2);k++) {
				if(k==1||k==(i*2-1)) {
				
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=4;i>0;i--) {
			for(int m=4;m>=i;m--) {
				System.out.print(" ");
			}
			for(int n=1;n<(i*2);n++) {
				if(n==1||n==i*2-1) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		*/
		
		//Hollow Hourglass pattern
		for(int i=5;i>0;i--) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<(i*2);k++) {
				if(i==5||k==1||k==(i*2-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			for(int l=5;l>i;l--) {
				System.out.print(" ");
			}
			for(int m=1;m<(i*2);m++) {
				if(m==1||m==(i*2-1)||i==5) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
}
}
