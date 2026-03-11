package Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetBasics {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
		set.add(25);
		set.add(40);
		set.add(75);
		set.add(100);
		set.add(30);
		
		System.out.println(set);
		
		set.remove(30);
		System.out.println(set);
		
		System.out.println(set.contains(100));
		
		System.out.println(set.isEmpty());
		
		System.out.println(set.size());
		
		set.clear();
		
		System.out.println(set);

	}

}
