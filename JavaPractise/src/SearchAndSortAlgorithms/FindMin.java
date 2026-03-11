package SearchAndSortAlgorithms;

public class FindMin {

	public static void main(String[] args) {
		int arr[] = { 10,25,14,-7,-10,99,65};
		System.out.println("The min of the array is " +min(arr));

	}
	
	static int min(int arr[]) {
		int ans = arr[0];
		for(int i =1; i<arr.length;i++) {
			if(arr[i]<ans) {
				ans = arr[i];
			}
		}
		return ans;
	}

}
