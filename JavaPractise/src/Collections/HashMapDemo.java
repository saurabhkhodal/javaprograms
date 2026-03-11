package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
            
		//Adding values
		hm.put(400, "Saurabh");
		hm.put(401, "Harshal");
		hm.put(402, "Hari");
		hm.put(403, "Pratibha");
		hm.put(404, "Komal");
	    hm.put(404 , "Suchitra");
	    hm.put(405 , "Komal");
	
	    System.out.println(hm);            
	    
	    //Remove values
	    hm.remove(403);
	    System.out.println("After removing values: "+hm);
	    
	    //Get values from the hash map
	    System.out.println(hm.get(400));
	    
	    //Get all keys from the hashmap
	    System.out.println(hm.keySet());
	    
	    //Get all the values from the hashmap
	    System.out.println(hm.values());
	 
	    //Get a key and value pairs
	    System.out.println(hm.entrySet());        //here we get the values in the form of set
	    
	    //Reading values form the hashmap
	    //method 1
	    
	    for(Integer k:hm.keySet()) {
	    	System.out.println(k+"--->"+hm.get(k));
	    }
	    
	    //method 2
	    Iterator<Entry<Integer, String>>it=hm.entrySet().iterator();
	    
	    while(it.hasNext()) {
	    	Entry <Integer, String> entry = it.next();
	    	System.out.println(entry.getKey()+"---->"+entry.getValue());
	    }
	    
	    //hm.clear();
	    System.out.println(hm.size());
	}

}
