package Programs.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeArrays {
	public static List<Integer> mergeTwoArrays(int arr1[], int arr2[]){
		List<Integer> newArray = new ArrayList<>();
		
		for(int num: arr1) {
			newArray.add(num);
		}
		for(int num: arr2) {
			newArray.add(num);
		}
		return newArray;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of the array: ");
		int size1 = sc.nextInt();

		int arr1[] = new int[size1];
		System.out.println("Enter the elements in the array: ");
		
		for(int i=0; i< size1; i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the size of the second array: ");
		int size2 = sc.nextInt();
		
		int arr2[] = new int[size2];
		System.out.println("Enter the elements in the array: ");
		
		for(int i=0; i<size2; i++) {
			arr2[i] = sc.nextInt();
		}
		
		List<Integer> finalArray= mergeTwoArrays(arr1,arr2);
	    System.out.println(finalArray);
	}

}
