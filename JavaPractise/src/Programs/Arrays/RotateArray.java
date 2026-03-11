package Programs.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotateArray {
	public static List<Integer> rotateLeft(int arr[], int rotationCount) {
		

		    List<Integer> rotatedArr = new ArrayList<>();

		    int n = arr.length;
		    rotationCount = rotationCount % n; // this will work when the rotation count greater than array size. it will rotate through remainder

		    // Add elements from k to end
		    for (int i = rotationCount; i < n; i++) {
		    	rotatedArr.add(arr[i]);
		    }

		    // Add first k elements at the end
		    for (int i = 0; i < rotationCount; i++) {
		    	rotatedArr.add(arr[i]);
		    }

		    return rotatedArr;
		}

	public static List<Integer> rotateRight(int arr[], int rotationCount) {
		

		    List<Integer> rotatedArr = new ArrayList<>();

		    int n = arr.length;
		    rotationCount = rotationCount % n;

		    // Add last k elements first
		    for (int i = n - rotationCount; i < n; i++) {
		        rotatedArr.add(arr[i]);
		    }

		    // Add remaining elements
		    for (int i = 0; i < n - rotationCount; i++) {
		        rotatedArr.add(arr[i]);
		    }

		    return rotatedArr;
		}



	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of the array");

		int size = sc.nextInt();

		   int arr[] = new int[size];
		   
		   System.out.println("Enter the elements in the array");
		    for(int i =0; i<arr.length; i++) {
		    	arr[i] =  sc.nextInt();
		    }
		    
		    System.out.println("Enter the rotation count: ");
		    int rotationCount = sc.nextInt();
		    
		    System.out.println( rotateLeft (arr, rotationCount));
		    System.out.println( rotateRight (arr, rotationCount));
		    
		    sc.close();
		    
		    

	}

}
