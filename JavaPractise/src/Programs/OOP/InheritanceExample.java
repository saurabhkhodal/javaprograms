package Programs.OOP;

class Vehicle {
    protected String name;

    void displayName() {
        System.out.println("Vehicle name: " + name);
    }

}

class Bike extends Vehicle {
    private int price;

    void setPrice(int price) {
        this.price = price;
    }

    void displayPrice() {
        System.out.println("Bike price: " + price);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.name = "Bullet";   
        bike.setPrice(250000);

        bike.displayName();    
        bike.displayPrice();    
    }
}
