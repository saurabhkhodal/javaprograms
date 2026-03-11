package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetBasics {

	public static void main(String[] args) {
		Set<Integer> lhs = new LinkedHashSet<>();
		
		lhs.add(55);
		lhs.add(85);
		lhs.add(65);
		lhs.add(35);
		lhs.add(45);
		
		System.out.println(lhs);
		
	lhs.remove(35);
	
	System.out.println(lhs);
	
	System.out.println(lhs.size());
	
	lhs.clear();
	System.out.println(lhs);
	
	System.out.println(lhs.isEmpty());

	}

}
