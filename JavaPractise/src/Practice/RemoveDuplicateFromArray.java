package Practice;

import java.util.HashSet;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		// using hashset class
		
		int []arr = {22,26,27,21,25,26,27,28,29,30};
		HashSet<Integer> hs =new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			hs.add(arr[i]);
		}
		for(int nums:hs) {
			System.out.println(nums);
		}

	}

}
