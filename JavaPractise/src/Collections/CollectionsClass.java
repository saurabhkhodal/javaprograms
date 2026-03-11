package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsClass {

	public static void main(String[] args) {
		List <Integer> list = new ArrayList<>();
		list.add(35);
		list.add(36);
		list.add(33);
		list.add(34);
		list.add(32);
		list.add(31);
		list.add(30);
		list.add(30);
		
		System.out.println("Min Element:" + Collections.min(list));
		System.out.println("Max Element: " +Collections.max(list));
		System.out.println("Repeat Elements " +Collections.frequency(list, 30)+ " times");
		
		
	    Collections.sort(list);
	    Collections.sort(list, Comparator.reverseOrder());
	    System.out.println(list);

	}

}
