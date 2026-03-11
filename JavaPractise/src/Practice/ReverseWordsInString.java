package Practice;

public class ReverseWordsInString {

	public static void main(String[] args) {
	String name = "My Name Is Saurabh";
	//String result = " ";
	
	//split the string using space
	String[] words = name.split(" ");
	
	//first method
/*	//loop to print the  reverse string
	for(String word : words) {
		String reverseWords = " ";
		for(int i =word.length()-1;i>=0;i--) {
			reverseWords = reverseWords + word.charAt(i);
		}
		result = result + reverseWords + " ";
		}
	System.out.println(result.trim());
	
*/	
	 //second method
	StringBuilder result = new StringBuilder() ;
	for(String word : words){
			StringBuilder reverseWords = new StringBuilder(word);
			result.append(reverseWords.reverse().toString()).append(" ");
		}
	System.out.println(result);
		}
	}
	


