package Practice;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int sum=0,factors;
		Scanner sct = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number1 = sct.nextInt();
		
		for (int i =1 ; i<number1 ; i++) {
			factors = number1%i;
			if (factors==0) {
//				System.out.println(i);
				sum = sum + i;
			}
		
		}
		System.out.println("The sum of the factors of the number is " +sum);
		if (sum == number1) {
			System.out.println("The given number " +number1+ " is a perfect number");
		}
		else {
			System.out.println("The given number " +number1+ " is not a perfect number");	
		}
		
		
		

	}

}
