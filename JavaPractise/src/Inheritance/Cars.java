package Inheritance;

public class Cars extends Vehicles{        //Vehicles: parent or super class      Cars: sub or child class

	void passenger() {
		System.out.println("This is a passenger vehicle");
		
	}
	int price;
	String colour;
	Cars(){
		System.out.println("print nothing");
	}
	Cars (int price1,String colour1){
		this.price=price1;
		this.colour=colour1;
			
	}
	public static void main(String[] args) {
	
				Cars c= new Cars();
				c.racing();
				c.passenger();
				
				Vehicles vh = new Cars(50000, "Black");
				vh.racing();
			}
				

	}


