package Programs;

import java.util.Scanner;

public class FactorialOfNumber {
	
	public int findFactorial(int number) {
		int factorial =1;
		if (number>0) {
			for(int i =1; i<=number; i++) {
				factorial = factorial * i;
			}
		}
		return factorial;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the number ");
		int number = sc.nextInt();
		
		FactorialOfNumber fact =new FactorialOfNumber();
		int factorial = fact.findFactorial(number);
		
		System.out.println("The factorial of a number "+number+ " is "+factorial);
		
		sc.close();

	}

}
