package SearchAndSortAlgorithms;

public class MergeSort {
     int[]array;
     int[]tempMergeArr;
     int length;
	public static void main(String[] args) {
		int inputArr[]= {48,25,63,54,12,87};
		MergeSort ms = new MergeSort();
		ms.sort(inputArr);
		
		for(int i :inputArr) {
			System.out.print(i + " ");
		}

	}
	public void sort(int inputArr[]) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergeArr = new int[length];          //create temporary array
		devideArray(0,length-1);                     //recursive method
	}
	
	public void devideArray(int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
			
			//find the mid
			int mid = lowerIndex + (higherIndex-lowerIndex)/2 ;
			
			//it will sort the left side of the array
			devideArray(lowerIndex, mid);
			
			//it will sort the right side of the array
			devideArray(mid+1, higherIndex);
			
			mergeArray(lowerIndex, mid, higherIndex);
		}
	}
	
	public void mergeArray(int lowerIndex, int mid, int higherIndex) {
		for(int i=lowerIndex; i<= higherIndex; i++) {
			tempMergeArr[i]= array[i];
		}
		int i = lowerIndex;
		int j= mid + 1;
		int k =lowerIndex;
		
		while(i<=mid && j <= higherIndex) {                //here we are storing the values in the kth index in the temporary array
			if(tempMergeArr[i]<= tempMergeArr[j]) {
				array[k]= tempMergeArr[i];
				i++;
			}
			else {
				array[k]= tempMergeArr[j];
				j++;
			}
			
			k++;
		}
		
		while(i<=mid) {                                 //for the middle element
			array[k]= tempMergeArr[i];
			k++;
			i++;
		}
	}

}
