package Polymorphism;

public class MethodOverloading {
	
	static void method(int a, String b) {      //static method can overload
		System.out.println(a + " " +b);
		
	}
	static void method(String b, int a) {     //same argument different sequence
		System.out.println(b + " "+a);
	}
	
	void method(String b, String a) {
		System.out.println(b+ " "+a);
	}
	
	void method(int a) {
		System.out.println(a);
	}
//	protected void method(int a, String b) {     
//		System.out.println();
//	}
	

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.method("Saurabh", 26);
		mo.method(240, "saurabh");
		mo.method("Saurabh", "QA Test Engineer");
		mo.method(26);
		
	}

}
