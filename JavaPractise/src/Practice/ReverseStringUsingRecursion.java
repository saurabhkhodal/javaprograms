package Practice;

public class ReverseStringUsingRecursion {
	
	void reverseString(String str) {
		if (str==null || str.length()<=1) {
			System.out.println(str);
		}
		else {
			System.out.println(str.charAt(str.length()-1));
		}
		reverseString(str.substring(0,str.length()-1));
	}

	public static void main(String[] args) {
		String str = "My name is Saurabh";

		ReverseStringUsingRecursion obj = new ReverseStringUsingRecursion();
		obj.reverseString(str);
	}

}
