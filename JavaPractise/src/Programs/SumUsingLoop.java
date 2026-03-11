package Programs;

import java.util.Scanner;

public class SumUsingLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number for which you want to find the sum: ");
		int m = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= m; i++) {
			sum = sum + i;

		}
		System.out.println("The sum of first " + m + " numbers is: " + sum);
		
		double avg = (double)sum / m;
		System.out.println("The average of first " + m + " numbers is : " +avg );
	}

}
