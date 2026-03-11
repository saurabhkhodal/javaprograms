package Practice;

import java.util.Scanner;

public class GreaterNumberUsingIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a = sc.nextInt();
		System.out.print("Enter the second number: ");
		int b =sc.nextInt();
		System.out.print("Enter the third number: ");
		int c= sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("The number "+ a +" is a maximum number");
		}
		else if(b>c && b> a) {
			System.out.println("The number "+ b + " is a maximum number");
		}
		else {
			System.out.println("The number " +c+" is a maximum number");
		}
	}

}
