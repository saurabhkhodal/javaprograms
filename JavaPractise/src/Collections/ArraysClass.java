package Collections;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		
		int nums []= {5,6,8,2,1,4,7,3,9};
		int muns [] = {2,4,7,8,6,5,4};
		
		Arrays.sort(nums);	
        for(int i:nums) {
			System.out.print(i+ " ");
		}
		
		
		int index = Arrays.binarySearch(nums, 5);         //binary search will only work for sorted array
		System.out.println("\nThe index of the number 5 is: " +index);
		
		System.out.println(Arrays.compare(nums,muns));
		
		Arrays.fill(muns, 25);
		for(int j:muns) {
			System.out.print(j+ " ");
		}

	}

}
