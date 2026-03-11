package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {

	public static void main(String[] args) {
		
		Map<Integer, String> employee = new HashMap<>();
		
		employee.put(240, "Saurabh");
		employee.put(241, "Harshal");
		employee.put(242, "Haribhau");
		employee.put(243, "Pratibha");
		employee.put(244, "Komal");
		
	//	employee.put(240, "Prasad");      //it will override the previous value.
		
		employee.putIfAbsent(240, "Prasad");   //it will check if the key is present or not if not then it will put the value in the collection
		
		System.out.println(employee);
		
		for(Map.Entry<Integer,String>e: employee.entrySet()) {      //traverse the key and value
		System.out.println(e);
		
		System.out.println(e.getValue());
		System.out.println(e.getKey());
			
		}
		
		for(Integer key: employee.keySet()) {              //for traversing the key only
			System.out.println(key);
		}
		
		for(String value: employee.values()) {             //for traversing the value only
			System.out.println(value);
		}
		
		System.out.println(employee.containsKey(242));
		System.out.println(employee.containsValue("Saurabh"));
		
		System.out.println(employee.isEmpty());
		
	}

}
