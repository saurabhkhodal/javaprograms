package Inheritance;

public class Vehicles {

	void racing() {
		System.out.println("This is a racing car");
	}
	Vehicles(){
		System.out.println("If you do not want to print parameters then call this");
	}
	
	Vehicles(int price, String colour){
		System.out.println("If you want to print price and colour then call this");
	}
	
}
	
