package Programs.Strings;

import java.util.Scanner;

public class StringRotation {
	public boolean isRotation(String s1, String s2) {

		String str1 = s1.toLowerCase();
		String str2 = s2.toLowerCase();

		if (str1.length() != str2.length()) {
			return false;
		}

		String temp = str1 + str1;
		return temp.contains(str2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String s1 = sc.nextLine();
		System.out.println("Enter the second string: ");
		String s2 = sc.nextLine();

		StringRotation sub = new StringRotation();
		boolean stringRotation = sub.isRotation(s1, s2);

		if (stringRotation == true) {
			System.out.println("The given strings are substrings");
		} else {
			System.out.println("The given strings are not substrings");
			sc.close();
		}
	}
}
