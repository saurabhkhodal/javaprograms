package Programs;

import java.util.Scanner;

public class StringPrograms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter your First Name: " );
		String firstName = sc.nextLine();
		System.out.println("Enter your Last Name: " );
		String lastName = sc.nextLine();                                //nextLine = takes the full input whereas next = takes only the first word. If the input contains mulitple words use 
		
		String fullName = firstName + " " + lastName;
		System.out.println("Your full name is: "+fullName);

		String upperCase = fullName.toUpperCase();
		System.out.println("The uppercase of the name is: "+upperCase);
		
		String lowerCase = fullName.toLowerCase();
		System.out.println("The lowecase of the name is: "+lowerCase);
		
		String trimName = fullName.trim();
		System.out.println("The trim name is: "+trimName);
		
	 if(firstName.equals(lastName)) {
		 System.out.println("The strings have same value");
	 }
	 else {
		 System.out.println("The strings have different value");
	 }
	 
	 if(firstName.equalsIgnoreCase(lastName)) {
		 System.out.println("The strings have same value");
	 }
	 else {
		 System.out.println("The strings have different value");
	 }
	 
	 System.out.println("The character at 5th position: "+fullName.charAt(5));
	 
	 int a = 25;
	String b = String.valueOf(a);
	System.out.println("The value of b is: "+b);
	
	String sentence = "I learn Java, to code in Java language ";
	String newString = sentence.replace("Java", "Python");
	System.out.println("The final sentence is: "+newString);
	
	System.out.println("Is the word Python present in the string:"+ newString.contains("Python"));
	
	String subString = sentence.substring(8, 25);
	System.out.println("The required sentence is: "+subString);
	
	String[] split = sentence.split(" ");
	for(String words: split) {
		System.out.println("The words of the string are: "+words);
	}
	String color ="Brown";
	char[] characters= color.toCharArray();
	 for(char array : characters) {
		 System.out.println("The letters of the array are: "+array);
	 }
	}

}
