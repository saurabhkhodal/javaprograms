package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

	

class MyComparator implements Comparator<Animals>{
	
	@Override
	public int compare(Animals o1, Animals o2) {
//		return (int) (o1.weight-o2.weight);
		
		if(o1.weight ==o2.weight ||o1.age ==o2.age) {
			return o1.name.compareTo(o2.name);
		}
		
		return Double.compare(o1.weight, o2.weight);        //this is preferred
	}
}

public class ComparableAndComparator {

	public static void main(String[] args) {
		Animals a1 = new Animals(4,"Tiger", 6.00);
		Animals a2 = new Animals(16,"Moti", 16.50);
		Animals a3 = new Animals(12,"Simba", 12.00);
		Animals a4 = new Animals(10,"Leo", 10.00);
		Animals a5 = new Animals(4,"Rosi", 6.00);
		
		List<Animals> dogs = new ArrayList<>();
		dogs.add(a1);
		dogs.add(a2);
		dogs.add(a3);
		dogs.add(a4);
		dogs.add(a5);
		
		System.out.println(dogs);
		
		Collections.sort(dogs);
		System.out.println(dogs);
		
		
//		Collections.sort(dogs, Comparator.reverseOrder());
//		System.out.println(dogs);
//		
		Collections.sort(dogs, new MyComparator());
		System.out.println(dogs);
			}
		
            //using lambda expression	
	 
//	Collections.sort(dogs, (o1,o2)->o1.name.compareTo(o2.name));
//	System.out.println(dogs);
//	}
	}
		
