package Programs.Strings;

import java.util.Scanner;

public class CountOccuranceOfChar {
	
	public void charCount(String name) {

	    name = name.toLowerCase();
	    int length = name.length();

	    for (int i = 0; i < length; i++) {

	        char currentChar = name.charAt(i);
	        if (currentChar == ' ') {
	            continue;
	        }

	        int count = 0;
	        boolean alreadyCounted = false;

	        for (int k = 0; k < i; k++) {
	            if (name.charAt(k) == currentChar) {
	                alreadyCounted = true;
	                break;
	            }
	        }

	        if (alreadyCounted) {
	            continue;
	        }

	        for (int j = 0; j < length; j++) {
	            if (currentChar == name.charAt(j)) {
	                count++;
	            }
	        }

	        System.out.println(currentChar + " -> " + count);
	    }
	}



	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the string: ");
		String name = sc.nextLine();
		
		CountOccuranceOfChar cc = new CountOccuranceOfChar();
		cc.charCount(name);
		sc.close();
	}

	}


