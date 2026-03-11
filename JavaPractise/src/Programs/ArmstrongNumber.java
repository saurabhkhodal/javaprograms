package Programs;

import java.util.Scanner;

public class ArmstrongNumber {

    public int calculateArmstrongSum(int number) {

        int sum = 0;

        while (number > 0) {
            int temp = number % 10;
            sum = sum + (temp * temp * temp);
            number = number / 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check: ");
        int number = sc.nextInt();

        int originalNumber = number;   // IMPORTANT

        ArmstrongNumber an = new ArmstrongNumber();
        int result = an.calculateArmstrongSum(number);

        if (result == originalNumber) {
            System.out.println("The given number " + originalNumber + " is an Armstrong Number");
        } else {
            System.out.println("The given number " + originalNumber + " is NOT an Armstrong Number");
        }

        sc.close();
    }
}
