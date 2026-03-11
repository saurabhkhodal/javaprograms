package Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapBasics {

	public static void main(String[] args) {
		Map<Integer, String> emp = new TreeMap<>();
		
		emp.put(256, "Saurabh");
		emp.put(240, "Harshal");
		emp.put(260, "Hari");
		emp.put(222, "Komal");
		
		System.out.println(emp);
		
//		for(Map.Entry<Integer, String> e : emp.entrySet()) {
//			System.out.println(e);
//			System.out.println(e.getValue());
//			System.out.println(e.getKey());
//		}
		
		for(Integer i : emp.keySet()) {
			System.out.println(i);
		}
		
		for(String s : emp.values()) {
			System.out.println(s);
		}
		
		emp.remove(256);
		
		System.out.println(emp);

	}

}
