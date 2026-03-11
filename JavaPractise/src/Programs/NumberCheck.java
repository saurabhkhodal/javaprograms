package Programs;

import java.util.Scanner;

public class NumberCheck {
	String result;
	 public String verifyNumber(int number){
		  result = (number > 0) ? "Positive" 
	                : (number < 0) ? "Negative" 
	                : "Zero";	 
		 return result;
	    }
	

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number you want to check: ");
		int number = sc.nextInt();
		
		NumberCheck nc = new NumberCheck();
		String answer =  nc.verifyNumber(number);
		
		System.out.println("The given number is: "+answer);
		
		sc.close();
		
		

	}

}
