package Practice;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
//		String name1 ="SAAS";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check: ");
		String name1 = sc.nextLine();
		String name2 = "";
		char c;
		int a1 = name1.length();

		for (int j = 0; j < a1; j++) {

			c = name1.charAt(j);
			name2 = c + name2;

		}
		System.out.println(name2);

		if (name1.equalsIgnoreCase(name2)) {
			System.out.println("The given string " + name1 + " is a palindrome string");
		} else {
			System.out.println("The given string " + name1 + " is not a palindrome string");
		}
	}

}
