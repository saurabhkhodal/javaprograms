package Practice;

public class MaxSumFrom2DArray {

	public static void main(String[] args) {
	int arr[][]= {{1,2,3},{2,3,4}};	
 System.out.println(maxSum(arr));
	}
	
	
	public static int maxSum(int[][]arr) {
		int ans = Integer.MIN_VALUE;
		for(int[]ints : arr) {
			int sum =0;
			
			for(int int2: ints) {
				sum=sum + int2;
			}
			if(sum > ans) {
				ans = sum;
			}
		}
		return ans;
	}

}
