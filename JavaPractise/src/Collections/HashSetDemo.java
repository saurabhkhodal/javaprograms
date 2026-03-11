package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Object> mySet = new HashSet<Object> ();
		
		//adding elements into hashset
		
		mySet.add(250);
		mySet.add(250);
		mySet.add(10.5);
		mySet.add("Saurabh");
		mySet.add('A');
		mySet.add(true);
		mySet.add(null);
		mySet.add(null);
		
		System.out.println("The elements in the set: "+mySet);
		
		//Removing element
		mySet.remove(10.5);
		System.out.println("After removing the element: "+mySet);
		
		//Insertion is not allowed
		
		//Access specific element not allowed
		
		//Convert hash set to the array list
		
		ArrayList<Object> al = new ArrayList<Object> (mySet);
		System.out.println(al.get(2));
		
		//read all values from the set 
		for(Object x : mySet) {
			System.out.println(x);
		}
		
		//Using iterator
		Iterator<Object> it = mySet.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//size of hashset
		System.out.println("The size of set is "+mySet.size());
		
		//clear all values
//		mySet.clear();
		System.out.println(mySet);
		
		

	}

}
