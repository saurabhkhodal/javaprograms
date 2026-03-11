package Inheritance;

public class Bikes extends Cars{
	void bicycle() {
		System.out.println("This is a Normal vehicle");
	}
	
	public static void main(String[]args) {
		Bikes b = new Bikes();
		b.racing();
		b.passenger();
		b.bicycle();
		
		
	}
 
}
