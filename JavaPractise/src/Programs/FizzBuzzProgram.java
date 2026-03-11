package Programs;

import java.util.Scanner;

public class FizzBuzzProgram {
	public void checkProgram(int number) {
		if (number%3==0 && number %5 ==0) {
			System.out.println("The number " +number+" is FizzBuzz ");
		}
		else if(number%5==0) {
			System.out.println("The number "+number+ " is Buzz ");
		}
		else if(number%3==0) {
			System.out.println("The number " +number+ " is Fizz ");
		}
		else {
			System.out.println("The number " +number+ " is neither a Fizz and nor a Buzz ");
		}
		
	
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number you want to check: ");
        int num =sc.nextInt();
		FizzBuzzProgram fb =new FizzBuzzProgram();
		fb.checkProgram(num);
sc.close();
	}

}
