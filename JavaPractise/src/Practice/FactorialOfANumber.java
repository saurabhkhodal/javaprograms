package Practice;
import java.util.Scanner;

public class FactorialOfANumber {

//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the number : ");
//		int num1 = sc.nextInt();
//		int temp =1, factorial=0;
//		
//		for (int i =1; i<=num1; i++) { // 1,2,3
//		temp = temp * i;         //1, 2,3
//		factorial = temp;  
//		}
//		System.out.println(factorial);
//	}
//
//}
//


//factorial of a number using recursion

public static int fact (int n) {
	if (n==1) {
		return 1;
	}
	else {
		return n*fact(n-1);
	}
}

public static void main(String[]args) {
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Enter the number for which you want to find the factorial: ");
	int n = sc1.nextInt();
	
	System.out.println("Factorial of a number is " +fact(n));
}
	
}