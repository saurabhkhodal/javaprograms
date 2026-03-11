package Programs.Strings;

import java.util.Scanner;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
	
	

	public void removeDup(String word) {
	    word = word.toLowerCase();
	    LinkedHashSet<Character> set = new LinkedHashSet<>();

	    for (int i = 0; i < word.length(); i++) {
	        set.add(word.charAt(i));  // duplicates automatically ignored
	    }

	    for (char ch : set) {
	        System.out.print(ch);
	    }
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String word= sc.nextLine();

		RemoveDuplicate rd = new RemoveDuplicate();
		rd.removeDup(word);
		sc.close();
	}

}
