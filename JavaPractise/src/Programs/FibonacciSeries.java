package Programs;

import java.util.Scanner;

public class FibonacciSeries {

    public void printSeries(int n) {

        int first = 0;
        int second = 1;

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
        																														
        System.out.print(first + " ");

        if (n == 1) return;

        System.out.print(second + " ");

        for (int i = 3; i <= n; i++) {

            int next = first + second;

            System.out.print(next + " ");

            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many Fibonacci numbers you want: ");
        int n = sc.nextInt();

        FibonacciSeries fs = new FibonacciSeries();
        fs.printSeries(n);

        sc.close();
    }
}
