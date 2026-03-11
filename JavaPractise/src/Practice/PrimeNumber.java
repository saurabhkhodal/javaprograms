package Practice;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num =sc1.nextInt();
		int temp=0,count =0;
		
	  for (int i=1; i<=num; i++) {
		  temp = num%i;
		  if(temp ==0) {
			  count++;
		  }
	  }System.out.println(count);
		if (count==2) {
			System.out.println("The given number " +num+ " is a prime number");
		}
		else {
			System.out.println("The given number " +num+ " is not a prime number");
		}

	}

}
