package Practice;

public class StringPractice {

	public static void main(String[] args) {
//		String s = "Java Practice";
//		String s2 = "Java Practice";
//		
////		int character = s.charAt(5);
////       System.out.println( character);
//       
//		System.out.println(s.compareTo(s2));
//		System.out.println(s.compareToIgnoreCase(s2));
//		System.out.println(s2.concat(s));
//		System.out.println(s.contains(s2));
//		
		//write a java program to find the first non-repeating characters in the string
		
//		String str = "abcdcbad";
//		
//		for(int i=0;i<str.length();i++) {                        //0
//			boolean unique = true ;                                
//			for (int j=0;j<str.length();j++) {                   //1
//				if (i!=j && str.charAt(i)==str.charAt(j)) {
//					 unique = false ;
//					 break;
//				}
//				
//			}
//			if(unique==true) {
//				System.out.println("The non repeating character in the string is :"+str.charAt(i));
//			}
//			else {
//				System.out.println("The string does not contain unique characters");
//			}
//		}
       
// devide the string in equal number of strings
	
//		        String randomString = "werrqw";  // Example string
//		        int strlen = randomString.length();
//
//		        // Iterate through all divisors of the string length
//		        for (int i = 1; i <= strlen; i++) {
//		            if (strlen % i == 0) {  // Check if the length is divisible by 'i'
//		                int devide = strlen / i;  // The size of each part
//
//		                // Print each part of the string
//		                for (int j = 0; j < i; j++) {
//		                    // Extract each substring based on the part size
//		                    String part = randomString.substring(j * devide, Math.min((j + 1) * devide, strlen));
//		                    System.out.println(part);
//		                }
//
//		                System.out.println();  
//		            }
//		        }
		        
		   
		       //sum of numbers in the string
		String numberString = "dsfs56dfs6532sdf234";
		String numbers = "";
		int sum =0;
		char arr[]= numberString.toCharArray();
		
		for(int i= 0;i<arr.length;i++) {
			char ch = arr[i];
			if(Character.isDigit(ch)) {
				numbers +=ch;
			}
		}
		System.out.println(numbers);
		for (int j=0;j<numbers.length();j++) {
			sum =sum+Character.getNumericValue(numbers.charAt(j));
		}
		System.out.println(sum);
	}
}
