package InnerClasses;

public class Bikes {
   String manufacturer;
   String model;
   
   public Bikes(String manufacturer, String model) {
	   this.manufacturer=manufacturer;
	   this.model = model;
   }
   
   void startBike() {
	   System.out.println("The " + manufacturer +" " + model +" bike has started!!");
   }
   
   
   
     public class Engine{
	   String power;

	public Engine(String power) {
	
		this.power = power;
	}
	  void start() {
		  System.out.println("The engine of power " +power +" in " +model +" has started!!");
	  }
   }
}
