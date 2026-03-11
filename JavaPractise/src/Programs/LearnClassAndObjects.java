package Programs;

public class LearnClassAndObjects {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.price = 110000;
		bike.color = "Black";
		bike.name = "Honda Shine";
		bike.cotation();

		
		Car car = new Car();
		car.price = 800000;
		car.color = "White";
		car.name = "Tata Altroz";
		car.engineType = "Petrol";
		car.cotation();
	}
}
	
	class Bike {
		
		String name;
		int price;
		String color;
		
		void cotation() {
				System.out.println("The cotation of the bike is:  Bike Name: "+name + ", "+ "Bike Price: " +price+ ", "+ "Bike Color: "  +color);
			}
		}
		
	class Car {
		String name;
		int price;
		String engineType;
		String color;
		
		void cotation() {
			System.out.println("The cotation of the car is:  Car Name: "+name + "," + "Car Engine Type: "+engineType+ ", "+ "Car Price: " +price+ ", "+ "Car Color: "  +color);
		}
	}
	


