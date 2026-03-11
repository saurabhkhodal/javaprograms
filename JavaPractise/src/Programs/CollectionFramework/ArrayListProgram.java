package Programs.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProgram {
	
	public ArrayList<String> addCities(ArrayList<String> al) {
	al.add("Bangalore");
	al.add("Pune");
	al.add("Hyderabad");
	al.add("Mumbai");
	al.add("Ahmedabad");
	
	
	return al ;}

	public static void main(String[] args) {
		
    ArrayList<String> al = new ArrayList<>();
    
    ArrayListProgram alp = new ArrayListProgram();
    System.out.println(alp.addCities(al));
    
    //fetch city using for loop
    for(int i=0; i<al.size(); i++) {
    	System.out.println(al.get(i));
    }
    
    //fetch city using for each
    for(String city : al) {
    	System.out.println(city);
    }
    
    //fetch using iterator
    
    Iterator<String> it = al.iterator();
     while(it.hasNext()) {
    	 System.out.println(it.next());
     }
    
	}

}
