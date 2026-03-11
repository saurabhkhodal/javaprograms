package InnerClasses;

public class Runner {

	public static void main(String[] args) {
		Bikes b = new Bikes("Bajaj", "Chetak 3502");
		
		Bikes.Engine e= b. new Engine("3.2kW");
		e.start();
		b.startBike();

	}

}
