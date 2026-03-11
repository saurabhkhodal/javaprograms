package Programs.Arrays;

import java.util.Scanner;

public class IsSortedArray {
	
	public boolean checkIfArraySorted(int arr[]) {
		
		if(arr==null || arr.length<2) {
			return true;
		}
		
		for(int i =0; i< arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		}
		
	return true;}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
System.out.println("Enter the size of the array");

int size = sc.nextInt();

   int arr[] = new int[size];
   
   System.out.println("Enter the elements in the array");
    for(int i =0; i<arr.length; i++) {
    	arr[i] =  sc.nextInt();
    }
    IsSortedArray sa = new IsSortedArray();
    boolean isSorted = sa.checkIfArraySorted(arr);
    System.out.println("The array is sorted => "+isSorted);
    sc.close();
	}

}
