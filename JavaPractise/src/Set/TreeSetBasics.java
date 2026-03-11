package Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetBasics {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		
		set.add(11);
		set.add(55);
		set.add(33);
		set.add(44);
		set.add(22);
		set.add(66);
		set.add(99);
		
		System.out.println(set);
		
		set.remove(22);
		System.out.println(set);
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}

	}

}
