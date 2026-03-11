package Programs.Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
	


	public static Set<Integer> removeDuplicates(int[] arr) {

	    Set<Integer> uniqueElements = new HashSet<>();

	    for (int num : arr) {
	        uniqueElements.add(num);
	    }

	    return uniqueElements;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter the elements in the array: ");
		
		for(int i=0; i< size; i++) {
			arr[i]=sc.nextInt();
		}
		
		Set<Integer> finalArray =removeDuplicates(arr);
		System.out.println(finalArray);
		sc.close();
		
		
	}

}
