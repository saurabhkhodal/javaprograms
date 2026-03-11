package SearchAndSortAlgorithms;

public class BinarySearchInJava {

	/* public static void main(String[] args) {
		// Binary search can only be applied for the sorted array. If not we have to sort the array using sorting techniques

		int [] values = {2,4,6,8,10,12,14,15,18,21,24,27,30};
		
		int search =35;
		int lowerIndex =0;
		int higherIndex = values.length-1;
		int middleIndex = lowerIndex + (higherIndex-lowerIndex)/2;
		
		while(lowerIndex<=higherIndex) {
		if(values[middleIndex]==search) {
			System.out.println("The value is present at the "+middleIndex+" index position");
		break;
		}
		
		else if(values[lowerIndex]< values[middleIndex]) {
			lowerIndex = middleIndex+1;
		}
		
		else {
			higherIndex = middleIndex -1;
		}
		
		middleIndex =lowerIndex + (higherIndex-lowerIndex)/2;
	}
		if(lowerIndex > higherIndex) {
			System.out.println("No Data Found");
		}
	}
	*/
	
	//Using the methods
	
	public static void main(String[] args) {
		int [] arr = {2,4,6,8,10,12,14,15,18,21,24,27,30};
		int target = 500;
		int ans = binarySearch(arr,target);
		System.out.println(ans);
	}
	
	static int binarySearch(int arr[], int target) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			
			int mid = start +(end -start)/2;
			if(target < arr[mid]) {
				end = mid-1;
			}
			else if(target > arr[mid]) {
				start = mid +1;
			}
			else
				return mid;
			
		}
	
		return -1;
	}

}
