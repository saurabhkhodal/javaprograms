package Practice;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
//		String s1 = "SAURABHKHODAL";
		 Scanner sc = new Scanner(System.in);  
		 System.out.println("Enter the string : ");
	     String s1 = sc.nextLine();  
		String s2 = "";
		char s;
		int l = s1.length();

		for (int i = 0; i < l; i++) {
			s = s1.charAt(i);
			s2 = s + s2;
		}
		System.out.println(s2);
	}

}
