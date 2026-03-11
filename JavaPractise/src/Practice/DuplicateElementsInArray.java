package Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		int[] arr = {53,56,78,78,53,53,78,78,53};
/*	//Brute Force Method
		//limitations: if the number in array is more than 2 times then this method is not much efficient it will give repetitive values
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]&&(i!=j)) {
					System.out.print(arr[i]+ " ");
					return;                                   //to find the first duplicate element we have used return
				}
			}
		}
*/	
/*		//Using set interface
		//In this method also if the number is repeated more than twice then the number is printed multiple times
		
		System.out.print("Duplicate elements are ");
		Set<Integer> arr1 = new HashSet<>();               //set interface does not store the duplicate values
		for(int num:arr) {
			if(arr1.add(num)==false) {                    //arr1.add(num) returns boolean value
				System.out.print(num+ " ");
			}
		}
		
*/
/*		//By using hash table
		
		Map<Integer,Integer> hm = new HashMap<>() ;
		for(int no : arr) {
			Integer count = hm.get(no);
			if(count ==null) {
				hm.put(no, 1);
			}
			else {
				count+=1;
				hm.put(no, count);
			}
		}
		System.out.print("Duplicate elements are:");
		Set<Map.Entry<Integer, Integer>> es = hm.entrySet();
		for(Map.Entry<Integer, Integer> me :es) {
			if(me.getValue()>1) {
				System.out.print(me.getKey()+" ");
			}
		}
*/		
		//First duplicate element
/*		
		int temp =-1;
		HashSet <Integer>hs = new HashSet<>();
		for(int i=arr.length-1;i>=0;i--) {
			if(hs.contains(arr[i])) {
				temp =i;
			}
			else {
				hs.add(arr[i]);
			}
		}
		if(temp!=-1) {
			System.out.println("The first duplicate element is "+arr[temp]);
		}
		else {
			System.out.println("No duplicate element present in the list");
		}
	*/	
		//Non-Repetitive element
		int reference =arr[0];
		for(int i=1;i<arr.length;i++ ) {
			reference = reference^arr[i];
		}
		System.out.println(reference);
		
	}

}
