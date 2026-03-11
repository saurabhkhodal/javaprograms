package Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) throws Exception{
		
	//Declaration
	//	ArrayList al = new ArrayList();
        
	//	List myList = new ArrayList();
		
	ArrayList <Integer> mal = new ArrayList<Integer>();
	
	//Adding data into arraylist
	mal.add(100);
	mal.add(120);
	mal.add(100);
	mal.add(121);
	mal.add(200);
	mal.add(null);
	mal.add(null);
	
	//printing
	System.out.println(mal.size());
	System.out.println("Full Array: "+mal);
	
	//remove element from arraylist
	mal.remove(5);
	System.out.println("After removing element from array: " +mal);
	
	//insert element into position
	mal.add(3, 300);
	System.out.println("After inserting element into the array: "+mal);
	
	//modify the value of the array
	mal.set(2, 111);
	System.out.println("After modifying the value of the arrya: "+mal);
	
	//Access specific element
	mal.get(3);
	System.out.println("The element at the third index is: "+mal.get(3));
	
	//reading all values from the arraylist
	//method 1 -> for loop
	for(int i=0; i<mal.size(); i++) {
		System.out.print(" "+mal.get(i));
	}
	
	//method 2 -> enhanced for loop
	System.out.println();
	for(Integer myList : mal) {
		System.out.print(" " +myList);
	}
	
	System.out.println();
	//method 3 -> iterator
	
	Iterator<Integer> it = mal.iterator();
    
	while (it.hasNext()) {
	    Integer arr = it.next();  
	    
	    if (arr != null) {
	        System.out.println(arr);
	    } else {
	        System.out.println("Null value found");
	    }
	}
	
	
	ArrayList<Integer>smallArr = new ArrayList<Integer>();
	smallArr.add(200);
	smallArr.add(null);
	mal.removeAll(smallArr);  //if we want to remove some values then we store this values in separate arrays and then we remove that array using removeAll method
	
//	mal.clear();         // this will clear the whole array.
	System.out.println("After removing multiple elements: "+mal);
	}

}
