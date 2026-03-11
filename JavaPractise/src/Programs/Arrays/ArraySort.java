package Programs.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
/*
    public static void bubbleSort(int[] arr) {

        if (arr == null || arr.length < 2) {
            return; // Already sorted
        }

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false; // Optimization: track if any swaps occurred

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swaps occurred, the array is already sorted
            if (!swapped) {
                break;
            }
        }
        
  */      
    	static void insertionSort(int arr[]) {
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
   

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

      //  bubbleSort(arr);
        
        insertionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        sc.close();
    }
}

