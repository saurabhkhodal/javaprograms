package Programs;
import java.util.Scanner;

public class SwapNumbers {
	public void swapWithoutThirdVar(int a , int b) {
		a = a+b;  //5 , 8
		b = a-b;  // 5
		a = a -b;
		System.out.println("The value after swapping are "+a+ ", "+b );
	}
	
	public void swapWithThirdVar(int a, int b) {
		int temp =a;
		 a = b;
		 b = temp;
		 System.out.println("The value after swapping are "+a+ ", "+b );
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		
		SwapNumbers sn = new SwapNumbers();
	    sn.swapWithoutThirdVar(a, b);

	    sn.swapWithThirdVar(a,b);
	    sc.close();
	    
	}

}
