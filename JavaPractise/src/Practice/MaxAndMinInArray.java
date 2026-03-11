package Practice;

public class MaxAndMinInArray {

	public static void main(String[] args) {
		int [] numbers = {55,44,33,66,77,22,11,88,99};
		int max = numbers[0];                //assuming the first number as maximum
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>max) {
				max=numbers[i];
			}
		}
		System.out.println("The maximum number in the array is "+max);

		
		//finding the minimum element from the array
		int min =numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]<min) {
				min = numbers[i];
			}
		}
		System.out.println("The minimum number in the array is "+min);
	
	//find the second largest and smallest element
	//if we want to print only second largest or smallest element then we can use break after i==1;
		
/*	for(int i=0;i<numbers.length;i++) {
		for(int j=i+1;j<numbers.length;j++) {
			if(numbers[i]<numbers[j]) {
				int temp = numbers[i];
				numbers[i]= numbers[j];
				numbers[j]= temp;
			}
		}
	}
	for(int i=0;i<numbers.length;i++) {
		System.out.print(numbers[i]+ " ");
	}
	System.out.println();
	int secondLargest = numbers.length-2;
	System.out.println("The second largest element of the array is "+numbers[1]);
	System.out.println("The second smallest element of the array is "+numbers[secondLargest]);
	
	*/
	
	//                  OR
	     int max1,max2;
		if(numbers[0]>numbers[1]) {
			 max1 =numbers[0];
			 max2 =numbers[1];
		}
		else {
			 max2 =numbers[0];
			 max1 =numbers[1];
		}
		for(int i=2; i<numbers.length;i++) {
			if(numbers[i]>max1) {
				max2=max1;
				max1 =numbers[i];
			}
			
			else if(numbers[i]>max2 && numbers[i]!=max1) {
				max2 = numbers[i];
			}
		}
System.out.println("The largest number in an Array is " +max1  + " and The second largest number in an Array is "+ max2);
}
}
