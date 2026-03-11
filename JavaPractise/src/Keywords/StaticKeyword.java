package Keywords;

public class StaticKeyword {

	 static int m =100;
	 int n = 30;
	 
	 static void m1() {
		 System.out.println("This is a static method......");
	 }
	 
	 void m2() {
		 System.out.println("This is a non static method.......");
	 }
	 
	 public static void main(String[] args) {
		 
	    System.out.println(m);
		m1();
		
		StaticKeyword sk = new StaticKeyword ();
		sk.m2();
		System.out.println(sk.n);
	}

}