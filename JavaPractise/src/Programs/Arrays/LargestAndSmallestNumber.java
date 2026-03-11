package Programs.Arrays;
import java.util.Scanner;

public class LargestAndSmallestNumber {

    public static int[] findLargestAndSmallest(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return new int[]{max, min};
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

        int[] result = findLargestAndSmallest(arr);

        System.out.println("Largest => " + result[0]);
        System.out.println("Smallest => " + result[1]);

        sc.close();
    }
}
