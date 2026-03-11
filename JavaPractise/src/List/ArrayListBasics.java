package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListBasics {
public static void main(String[] args) {
	

	List <Integer> list = new ArrayList<>();
	list.add(5);
	list.add(10);
	list.add(15);
	list.add(20);
	list.add(25);
	list.add(30);
	
	System.out.println(list);
	
	System.out.println(list.contains(50));   // it will check if the specified element is present at the location
	
	list.add(5, 35);        //insert element at a specific index
	
	System.out.println(list);
	
	ArrayList <Integer> newArrayList = new ArrayList<>();
	newArrayList.add(100);
	newArrayList.add(200);
	
	list.addAll(2, newArrayList);                       //to add the new arraylist into the main arraylist
	
	System.out.println(list);
	
	System.out.println(list.size());
	System.out.println(list.get(3));                        //to get the element from the specified index
	
  list.remove(5);
  System.out.println(list);
  
  list.remove(Integer.valueOf(30));                       //it will remove the element having value 30
  
//  list.clear();                                          //it will clear the list
System.out.println(list);     

   list.set(0, 50);                                       //for updating the element at specific index
   System.out.println(list);
   
   //Traversing the elemnts in the array
   
   //    Method 1
   for(int i =0; i<list.size();i++) {
	   System.out.println(list.get(i));
   }
   
   //   Method 2
   for(Integer e : list) {
	   System.out.println("For Each " +e);
   }
   
   //Method 3
   Iterator<Integer> it = list.iterator();
   while(it.hasNext()) {
	   System.out.println("Iterator " + it.next());
   }

}
}
