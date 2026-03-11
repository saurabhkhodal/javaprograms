package Programs.OOP;

// Parent class
class Vehicles {
    public void vehicleT(String engineType) {
        System.out.println("Vehicle engine type: " + engineType);
    }
}

// Child class
class Cars extends Vehicles {

    @Override
    public void vehicleT(String engineType) {
        System.out.println("Car engine type: " + engineType);
    }
}

public class MethodOverride {

    public static void main(String[] args) {

        Vehicles v = new Cars(); 
        v.vehicleT("Petrol");
    }
}
