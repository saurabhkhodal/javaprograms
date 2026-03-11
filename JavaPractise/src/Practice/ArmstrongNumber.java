package Practice;

import java.util.Scanner;

public class ArmstrongNumber {
	//Armstrong number means the sum of the cubes of the digits in a number is equal to the number i.e 153 = 1^3 + 5^3 +3^3 = 1 + 125 + 27 = 153;

	public static void main(String[] args) {
		int number_formed = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int input_number = sc.nextInt();
		int temp = input_number;

		while (input_number > 0) { // 153, 15 , 1
			int new_number = input_number % 10; // 3 ,5, 1
			number_formed = number_formed + (new_number*new_number*new_number);
			input_number = input_number /10 ;

		}
	//	System.out.println("The new number formed is : " +number_formed);
		if (temp == number_formed) {
			System.out.println("The given number " +temp + " is a Armstrong number");
		}
		else {
			System.out.println("The given number " +temp + " is not a Armstrong number");
		}

	}
}
