package Encapsulation;

public class SubClass extends A{
	
	public SubClass(int num, String name) {
		super(num,name);
	}
	
	public static void mane(String[]args) {
		SubClass obj = new SubClass(45, "Rohit");
		int n =obj.num;
	}

}
