package SearchAndSortAlgorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 42, 97, 1234, 56, 789, 1023, 5, 67890, 321, 8765, 44, 90871, 1, 7654, 234 };
		bubblesort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void bubblesort(int[] arr) {
		boolean swapped;
		for (int i = 0; i < arr.length; i++) {
			swapped = false;
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					swapped = true;
				}

			}

			if (!swapped) {
				break;
			}
		}

	}
}
