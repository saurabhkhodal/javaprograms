package Programs.Strings;

import java.util.Scanner;

public class NonRepeatedChar {
	
   public void repeatCount (String name) {
	   
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
	        

	        
	        if(count ==1) {
	        	System.out.print(currentChar);
	        }
	    }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string: ");
	 String name = sc.nextLine();
	
	 
	 NonRepeatedChar npc = new NonRepeatedChar();
	 npc.repeatCount(name);
		sc.close();

	}

}
