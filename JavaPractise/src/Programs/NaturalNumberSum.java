package Programs;
import java.util.Scanner;

public class NaturalNumberSum {

    public void calculateSum(int number) {

        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int sum = 0; // local variable

        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }

        System.out.println("The sum of first " + number + " natural numbers is " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the value up to which you want the sum: ");
        int number = sc.nextInt();

        NaturalNumberSum ns = new NaturalNumberSum();
        ns.calculateSum(number);

        sc.close();
    }
}
