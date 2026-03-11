package SearchAndSortAlgorithms;

import java.util.Arrays;

public class CyclicSort {
	public static void main(String[] args) {
		int arr[] = { 5, 3, 1, 2, 4 };
		cyclic(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void cyclic(int arr[]) {
		int i = 0;
		while (i < arr.length - 1) {
			int correctIndex = arr[i] - 1;
			if (arr[i] != arr[correctIndex]) {
				swap(arr, correctIndex, i);

			} else {
				i++;
			}

		}

	}

	static void swap(int arr[], int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
