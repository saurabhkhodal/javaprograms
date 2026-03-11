package List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListBasics {
public static void main(String[] args) {
	List <Integer> marks = new LinkedList<>();
	
	
	marks.add(85);
	marks.add(91);
	marks.add(95);
	marks.add(97);
	marks.add(90);
	
	marks.add(2, 86);
	
	
	LinkedList <Integer> ll = new LinkedList<>();
	ll.add(93);
	ll.add(87);
	
	marks.addAll(ll);
	System.out.println(marks);
	
	marks.remove(3);
	 
	marks.size();
	marks.get(5);
	
	Integer.valueOf(97);
	
	System.out.println(marks);
}
}
