package Programs;

import java.util.Scanner;

public class CountDigits {

    public int noOfDigits(int number) {

        if (number == 0) {
            return 1;
        }

        number = Math.abs(number);  // handle negative numbers

        int count = 0;

        while (number > 0) {
            number = number / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number: ");
        int number = sc.nextInt();

        CountDigits cd = new CountDigits();
        int digits = cd.noOfDigits(number);

        System.out.println("The number of digits in " + number + " is " + digits);

        sc.close();
    }
}
