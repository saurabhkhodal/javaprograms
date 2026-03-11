package ExceptionHandeling;

import java.util.Scanner;

public class ExceptionHandle {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of a: ");
	int a = sc.nextInt();
	System.out.println("Enter the value of b: ");
	int b = sc.nextInt();
	
	try {
		devide(a,b);
     int c = a/b;
     System.out.println(c);
}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
	finally {
		System.out.println("This block will always execute" + ", " + "Close The file");
	}
	
}
static int devide(int a, int b) throws ArithmeticException{
	if(b==0) {
		throw new ArithmeticException("Cannot divide by zero");
	}
	return a/b;
}
}
