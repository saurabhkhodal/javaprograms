package Programs;

public class ArraysPractice {

	public static void main(String[] args) {
		int numbers[] = { 23, 25, 45, 78, 96, 85, 45, 74, 12, 56 };

		int min = Integer.MAX_VALUE;
		for (int number : numbers) {
			if (number < min) {
				min = number;
			}
		}
		System.out.println("The minimum number is: " + min);
		int max = Integer.MIN_VALUE;
		for (int number : numbers) {
			if (number > max) {
				max = number;
			}
		}
		System.out.println("The maximum number is: " + max);

		int sum = 0;
		int count = 0;
		for (int number : numbers) {
			sum = sum + number;
			count++;
		}
		double average = (double) sum / count;
		System.out.println("The sum of the numbers of the array is: " + sum);
		System.out.println("The average of the numbers in the array is: " + average);

		int highestTotal = MultiDimentionalArray();
		System.out.println("The maximum sum of marks is:" + highestTotal);
	}

	public static int MultiDimentionalArray() {

		int maxSum = 0;
		int student[][] = { { 25, 24, 23 }, { 22, 25, 24 }, { 20, 21, 23 }, { 25, 20, 21 } };
		for (int i = 0; i < student.length; i++) {
			int sum = 0;
			for (int j = 0; j < student[i].length; j++) {
				sum = sum + student[i][j];
			}
			if (sum > maxSum) {
				maxSum = sum;
			}
		}

		return maxSum;
	}
}
