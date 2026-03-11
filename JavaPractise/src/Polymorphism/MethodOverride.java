package Polymorphism;

public class MethodOverride extends Shapes {

	public void area() {
		System.out.println("You are calling Child class area method");  
	}
	public static void main(String[] args) {
     MethodOverride mo = new MethodOverride();
     mo.area();
     
     Shapes shape = new Shapes();
     shape.area();
	}

}
