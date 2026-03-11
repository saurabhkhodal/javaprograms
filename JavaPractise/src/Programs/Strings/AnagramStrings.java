package Programs.Strings;

import java.util.Scanner;

public class AnagramStrings {
	
	public boolean isAnagram(String s1, String s2) {

	    s1 = s1.toLowerCase().replace(" ", "");
	    s2 = s2.toLowerCase().replace(" ", "");

	    if (s1.length() != s2.length()) return false;

	    char[] arr = s2.toCharArray();

	    for (int i = 0; i < s1.length(); i++) {
	        boolean found = false;

	        for (int j = 0; j < arr.length; j++) {
	            if (s1.charAt(i) == arr[j]) {
	            	arr[j] = '#';
	                found = true;
	                break;
	            }
	        }

	        if (!found) 
	        return false;
	    }

	    return true;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String: ");
		String s1= sc.nextLine();
		System.out.println("Enter the second String: ");
		String s2= sc.nextLine();
		
		AnagramStrings as = new AnagramStrings();
		boolean ifAnagram = as.isAnagram(s1, s2);
		System.out.println(ifAnagram);
		sc.close();

	}

}
