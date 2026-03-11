package Programs;
import java.util.Scanner;

public class PrintTables {

    public void printTable(int number, int limit) {

        if (number > 0 && limit > 0) {

            for (int i = 1; i <= limit; i++) {
                System.out.println(number + " X " + i + " = " + (number * i));
            }

        } else {
            System.out.println("Please enter positive numbers only.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for which you want to print the table: ");
        int number = sc.nextInt();

        System.out.print("Enter the limit up to which you want the table: ");
        int limit = sc.nextInt();

        PrintTables pt = new PrintTables();
        pt.printTable(number, limit);

        sc.close();
    }
}
