package Practice;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check: ");
		int check_number = sc.nextInt();
		int temp = 0, new_number = 0, old_number = check_number;

		while (check_number > 0) { // 456 45 4 0
			temp = check_number % 10; // 6 5 4
			new_number = new_number * 10 + temp; // 0+6 65 654
			check_number = check_number / 10; // 45 4 0

		}
		System.out.println(new_number);
		if (old_number == new_number) {
			System.out.println("The given number " + old_number + " is a palindrome number.");
		} else {
			System.out.println("The given number " + old_number + " is a not palindrome number.");

		}
	}

}
