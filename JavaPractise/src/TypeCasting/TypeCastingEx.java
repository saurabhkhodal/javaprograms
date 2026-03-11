package TypeCasting;

public class TypeCastingEx {

	public static void main(String[] args) {
		
//	Object o = new String ("Welcome");
//	StringBuffer sb = (StringBuffer)o; // Rule 1 and 2 -> pass , Rule 3 -> fail
//	
//	//Ex2
//	String s = new String ("Welcome");
//	StringBuffer sb = (StringBuffer)s; //Rule 1 failed
	
//	//Ex3
//	Object o = new String ("Welcome");
//	StringBuffer sb = (String) o;  //Rule 2 failed
//
//	//Ex4
//	String s = new String ("Welcome");
//	StringBuffer sb = (String)s;   //Rule 2 failed
		
//	//Ex5
//		Object o = new String ("Welcome");
//		StringBuffer sb = (StringBuffer)o;  // Rule 3 failed
		
		//Ex6
		Object o = new String ("Welcome");
		String s = (String)o;       // all rules satisfied
	
	}

}
