package Programs.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public int searchElement(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } 
            else if (target > arr[mid]) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); 
        System.out.println("Sorted array: " + Arrays.toString(arr));

        System.out.println("Enter element to search:");
        int target = sc.nextInt();

        BinarySearch bs = new BinarySearch();
        int index = bs.searchElement(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
