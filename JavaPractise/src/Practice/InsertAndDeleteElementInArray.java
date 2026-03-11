package Practice;

public class InsertAndDeleteElementInArray {

	public static void main(String[] args) {
		// Insert an element in the array
		
		int[] arr = {56,23,15,47,48,25};
/*		int position = 3;                               //index =2
		int element =50;
		for(int i=arr.length-1; i>position-1;i--) {
			arr[i]=arr[i-1];
		}
		arr[position-1]=element;

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
*/	
		//remove specific element from an array
		
		int delete_element = 50;
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(delete_element==arr[i]) {
				for(int j=i;j<arr.length-1;j++) {
					arr[j]=arr[j+1];
				}
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("Element not found in an array");
		}
		else {
			System.out.println("Element deleted successfully");
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
