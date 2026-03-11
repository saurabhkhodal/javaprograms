package Programs.CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(501,"Saurabh");
		map.put(502,"Hari");
		map.put(503,"Komal");
		map.put(504,"Suchitra");
		map.put(501,"Harshal");
		
		for(Integer key : map.keySet()) { System.out.println(key); }
		for(String value : map.values()) { System.out.println(value);}
		for(Map.Entry<Integer, String> entry : map.entrySet()) {  System.out.println(entry);}

		
		

	}

}
