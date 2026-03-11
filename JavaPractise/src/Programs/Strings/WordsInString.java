package Programs.Strings;

import java.util.Scanner;

public class WordsInString {
	
	public int countWords(String sentence) {

	    if (sentence == null || sentence.trim().isEmpty()) {
	        return 0;
	    }

	    int count = 0;
	    boolean inWord = false;

	    for (int i = 0; i < sentence.length(); i++) {
	        char ch = sentence.charAt(i);

	        if (ch != ' ' && !inWord) {
	            count++;
	            inWord = true;
	        } 
	        else if (ch == ' ') {
	            inWord = false;
	        }
	    }

	    return count;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the sentence: ");
		String sentence = sc.nextLine();
		
		WordsInString wordCount = new WordsInString();
		System.out.println("The number of words in the sentence: "+wordCount.countWords(sentence));
		

	}

}
