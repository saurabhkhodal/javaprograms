package Programs.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListProgram {

	public static void main(String[] args) {
		List <Integer> list = new ArrayList<Integer>();
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(104);
		list.add(104);
		list.add(101);
		
		Set<Integer> set = new LinkedHashSet<>();
		set.addAll(list);
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
		 System.out.println(it.next());
		}

	}

}
