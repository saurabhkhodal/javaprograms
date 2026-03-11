package Recursion;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {5,6,8,3,2,4,7};
         int target =4;
         int ans =search(arr,target,0,arr.length);
         System.out.println(ans);
	}
	
	static int search(int arr[],int target, int s, int e) {
		if(s>e) {
			return -1;
		}
		
		int m = s + (e-s)/2;
		
		if(arr[m]==target) {
			return m;
		}
		
		if(target < arr[m]) {
			return search (arr, target, s, m-1);
		}
		else {
			return search(arr, target, m+1,e);
		}
	}

}
