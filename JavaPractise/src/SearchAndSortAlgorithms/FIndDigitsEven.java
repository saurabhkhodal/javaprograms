package SearchAndSortAlgorithms;

public class FIndDigitsEven {

/*	public static void main(String[] args) {
		int nums[]= {25,123,145,14785,4526};
        System.out.println(findNumbers(nums));
	}
	static int findNumbers(int nums[]) {
		
		int count =0;
		for(int num :nums) {
			if(even(num)) {
				count ++;
			}
			
		}
		return count;
		
		}
       static boolean even(int num) {
		int numberOfDigits = digits(num);
		if(numberOfDigits % 2 ==0) {
			return true;
		}
		return false;
			
		}
				
		static int digits(int num) {
			int count =0;
			while(num>0) {
				count++;
				num =num/10;
			}
			return count;
		}
*/		
		       //method 2
		/*
   public static void main(String[] args) {
	int nums []= {25,123,145,14785,4526};
	System.out.println(findNumbers(nums));
   }
   static int findNumbers(int nums[]) {
	int count =0;
	for(int num : nums) {
		int digits =0;
		int temp = num;
		while(temp>0) {
			digits ++;
			temp =temp /10;
			}
		if(digits % 2==0) {
			count ++;
			System.out.println("The even digit numbers are \n " +num);
		}
}
	return count;
	}
   
  */ 
   /*                //Method 3
   public static void main(String[] args) {
	int nums []={25,123,145,14785,4526};
	System.out.println(findNumbers(nums));
	
}
   static int findNumbers(int nums[]) {
	   int count =0;
	   for(int num :nums) {
	   if((int)(Math.log10(num)+1)%2==0) {
		   count ++;
	   }
	   
   }
	return count;
	}
	
*/	
	 
	             //Method 4
	public static void main(String[] args) {
		int nums[]= {25,123,145,14785,4526};
		System.out.println(findNumbers(nums));
		
	}
	             static int findNumbers(int nums[]) {
	            	 int count =0;
	            	 
	            	 for (int num:nums) {
	            		 if(String.valueOf(num).length() %2==0) {
	            			 count++;
	            		 }
	            	 }
	            	 return count;
	             }
}	
 




