package Programs;

import java.util.Scanner;

public class PalindromeNumber {

    public int reverseNumber(int number) {

        int reversed = 0;

        while (number > 0) {
            int temp = number % 10;
            reversed = reversed * 10 + temp;
            number = number / 10;
        }

        return reversed;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number you want to check: ");
        int number = sc.nextInt();

        int originalNumber = number;  // IMPORTANT

        PalindromeNumber pn = new PalindromeNumber();
        int reversedNumber = pn.reverseNumber(number);

        if (reversedNumber == originalNumber) {
            System.out.println("The number " + originalNumber + " is a Palindrome Number");
        } else {
            System.out.println("The number " + originalNumber + " is NOT a Palindrome Number");
        }

        sc.close();
    }
}
