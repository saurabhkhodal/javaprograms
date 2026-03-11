package Programs.Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MissingNumberInSeries {

    public static void findMissingNumbers(int[] arr, int range) {

        Set<Integer> set = new HashSet<>();

        // Store array elements
        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Missing numbers are:");
        for (int i = 1; i <= range; i++) {
            if (!set.contains(i)) {
                System.out.print(i + " ");
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

        System.out.print("Enter range (N): ");
        int range = sc.nextInt();

        findMissingNumbers(arr, range);

        sc.close();
    }
}
