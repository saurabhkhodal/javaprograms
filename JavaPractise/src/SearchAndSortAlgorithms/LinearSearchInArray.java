package SearchAndSortAlgorithms;

public class LinearSearchInArray {

	//linear search in a array
/*	public static void main(String[] args) {
		int[]nums = {25,41,85,74,56,32,25,15,14,29};
		int checkValue = 32;
		boolean isFound =false;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==checkValue) {
				System.out.println("The value is present at "+i+ "th index");
				isFound =true;
        		  break;
			}
			}
			if(isFound==false) {
        	  System.out.println("No Data Found");
          }
		}

	*/
	
/*	//linear search in String
	public static void main(String[]args) {
          String [] roles = {"Front End Developer","Back End Developer","Quality Analyst","Data Analyst","Product Manager","Designer"};
          String checkRole= "Data";
          boolean isFound =false;
          
          for(int i=0;i<roles.length;i++) {
        	  if(roles[i].contains(checkRole)) {
        		  System.out.println("The role is present at "+i+ "th index");
        		  isFound =true;
        		  break;
        	  }
          }
          if(isFound==false) {
        	  System.out.println("No Data Found");
          }
          
}
  */
	
public static void main(String[] args) {
	int arr[] = { 5, 8, 68, 94, 58, 25, 96 };
	int target = 25;
	int ans = linearSearch(arr, target);
		
	if (ans == -1) {
		System.out.println("No element found in the array");
	}
	else {
	System.out.println("The element is present at the " + ans + "th index");
}
	}

static int linearSearch(int arr[], int target) {
	if (arr.length == 0) {
		return -1;
	}
	for (int i = 0; i < arr.length; i++) {
		int element = arr[i];
		if (element == target) {
			return i;
		}
	}
	
	return -1;
	
	
	
}
}
