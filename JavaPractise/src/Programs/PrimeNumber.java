package Programs;
import java.util.Scanner;

public class PrimeNumber {

	public boolean isPrime(int number) {
	    
	    if (number <= 1) {
	        return false;
	    }

	    for (int i = 2; i <= Math.sqrt(number); i++) {       //it is the fastest approach to find the prime number
	        if (number % i == 0) {
	            return false;
	        }
	    }

	    return true;
	}


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        PrimeNumber pm = new PrimeNumber();

        if (pm.isPrime(number)) {
            System.out.println("The given number is a prime number");
        } else {
            System.out.println("The given number is not a prime number");
        }

        sc.close();
    }
}
