package Programs;
import java.util.Scanner;

public class NumberReverse {

    public int reverse(int number) {

        int reverseNumber = 0;

        while (number > 0) {
            int temp = number % 10;
            number = number / 10;
            reverseNumber = reverseNumber * 10 + temp;
        }

        return reverseNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        NumberReverse nr = new NumberReverse();
        int reversed = nr.reverse(number);

        System.out.println("The reverse of the number is: " + reversed);

        sc.close();
    }
}

 