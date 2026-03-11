package Interfaces;

public class Main {

	public static void main(String[] args) {

//Car car = new Car();
//car.accelerate();              //if we call the methods directly then the methods will be common for all the classes. so we have to create separate classes. Hence each class contain its own methods
//car.start();
//car.stop();
//car.brake();

//Media carMedia = new Car();
//carMedia.start();
//carMedia.stop();


     NiceCar car = new NiceCar() ;
    	 car.start();
    	 car.startMusic();
    	 car.upgradeEngine();
    	 car.start();
    	 car.startMusic();
     

	}
}
