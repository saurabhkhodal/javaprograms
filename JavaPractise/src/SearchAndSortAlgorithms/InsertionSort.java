package SearchAndSortAlgorithms;

import java.util.Arrays;

public class InsertionSort {

	
/*public static void main(String[] args) {

      //insertion sort method
	
	int numbers []= {1, 3, 2, 4, 6, 5};
	int temp,j;
	
	for(int i=1;i<numbers.length;i++) {
		temp = numbers[i];
		j=i;
		while(j>0 && numbers[j-1]>temp) {
			numbers[j] = numbers[j-1];
			j=j-1;
		}
		numbers[j]=temp;
	}
	for(int i=0;i<numbers.length;i++) {
	System.out.print(numbers[i]+ " ");
	}

}

*/
	public static void main(String[] args) {
		int arr[]= {5,3,4,1,2};
		insertion(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void insertion(int arr[]) {
		for(int i =0;i<arr.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j]= arr[j-1];
					arr[j-1]= temp;
					
					
				}
				else {
					break;
				}
			}
			
		}
		}
	

}

//gives correct output but not a insertion sort method
//		int numbers[] =  {5,2,6,1,4,3};
//		int temp =0;
//		for(int i=0; i<numbers.length; i++) {
//			
//			for(int j=i+1;j<numbers.length;j++) {
//				temp =i+1;
//				if(temp<numbers[i]) {
//					temp =numbers[i];
//					numbers[i]=numbers[j+1];
//					numbers[j+1]= temp;
//				}
//				
//			}
//		}
//		for(int i=0;i<numbers.length;i++) {
//			System.out.print(numbers[i]+ " ");
//		}