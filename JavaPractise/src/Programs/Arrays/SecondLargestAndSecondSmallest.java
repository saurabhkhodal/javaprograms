package Programs.Arrays;

import java.util.Scanner;

public class SecondLargestAndSecondSmallest {

    public static void findSecondValues(int[] arr) {

        if (arr == null || arr.length < 2) {
            System.out.println("Array must have at least two elements");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {

            // For largest and second largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }

            // For smallest and second smallest
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE || secondSmallest == Integer.MAX_VALUE) {
            System.out.println("Second largest or second smallest not found (all values may be same)");
        } else {
            System.out.println("Second Largest = " + secondLargest);
            System.out.println("Second Smallest = " + secondSmallest);
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

        findSecondValues(arr);
        sc.close();
    }
}
