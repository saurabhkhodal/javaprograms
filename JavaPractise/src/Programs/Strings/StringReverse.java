package Programs.Strings;

import java.util.Scanner;

public class StringReverse {

    public String reverse(String text) {

        if (text == null || text.isEmpty()) {
            return text;
        }

        StringBuilder reversed = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }

        return reversed.toString();
    }

    public boolean isPalindrome(String text) {

        if (text == null) {
            return false;
        }

        String original = text.toLowerCase();
        String reversed = reverse(original);

        return original.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        StringReverse sr = new StringReverse();

        String reversed = sr.reverse(input);
        System.out.println("Reversed string: " + reversed);

        if (sr.isPalindrome(input)) {
            System.out.println("The given string is a Palindrome");
        } else {
            System.out.println("The given string is NOT a Palindrome");
        }

        sc.close();
    }
}
