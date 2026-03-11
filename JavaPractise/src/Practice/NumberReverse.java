package Practice;

import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num3 = sc.nextInt();
		int temp = 0, reverse_number = 0;

		while (num3 > 0) {
			temp = num3 % 10;
			reverse_number = reverse_number * 10 + temp;
			num3 = num3 / 10;
		}
		System.out.println(reverse_number);
	}

}
