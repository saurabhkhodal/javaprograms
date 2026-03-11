package Practice;

public class PrintNumbers {

	public static void main(String[] args) {
	/*	//diamond pattern
	 * 
	 * for(int i=1;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
				for(int k=1;k<(i*2);k++) {
					System.out.print(k);
					
				}
				System.out.println();
			}
		for(int i=4; i>=0;i--) {
			for(int j=5; j>i; j--) {
				System.out.print(" ");
			}
			for(int k =1; k<(i*2); k++) {
			System.out.print(k);
			}
			System.out.println();
		}
		
		*/
		//hollow diamond pattern
		for(int i=1;i<=5;i++) {
			for(int j=5;j>i;j--) {
				
			System.out.print(" ");
			}
			for(int k=1;k<=(i*2);k++) {
				if(k==1||k==(i*2-1)) {
				System.out.print(k);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=5;i>0;i--) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<(i*2);k++) {
				if(k==1||k==i*2-1) {
					System.out.print(k);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		}

	}


