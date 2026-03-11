package SearchAndSortAlgorithms;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[]arr = {10,30,50,40,60};
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	static void sort(int [] nums, int low, int high) {
		if(low >high) {
			return;
		}
		int start = low;
		int end = high;
		int mid = start +(end - start)/2;
		int pivot = nums[mid];
		
		while(start <= end) {
			
			while ( nums[start]< pivot) {
				start++;
			}
			while(nums[end]>pivot) {
				end--;
			}
			
			if (start <= end) {
				int temp =nums[start];
				nums[start]= nums[end];
				nums[end]= temp;
				start++;
				end--;
			}
		}
		
		//now pivot is at the correct position, now sort remaining half using recursion
		
		sort(nums,low, end);          //for left side
		sort(nums,start,high);        // for right side
	}

}
