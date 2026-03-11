package Programs.Strings;

import java.util.Scanner;

public class LongestWord {
	public void findLongestWord(String sentence) {

	    // Handle extra spaces
	    String[] words = sentence.trim().split("\\s+");

	    int max = 0;
	    int maxIndex = -1;

	    for (int j = 0; j < words.length; j++) {
	        int currentWordLength = words[j].length();

	        if (currentWordLength > max) {
	            max = currentWordLength;
	            maxIndex = j;
	        }
	    }

	    System.out.println("Longest word: " + words[maxIndex]);
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String sentence = sc.nextLine();

		LongestWord lw = new LongestWord();
		lw.findLongestWord(sentence);

	}

}
