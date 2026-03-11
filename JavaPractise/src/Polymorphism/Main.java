package Polymorphism;

import Encapsulation.A;

public class Main {
		
	

	public static void main(String[] args) {  
		Shapes shape = new Circle(5);
		shape.area();
		
		Shapes shape1 = new Square(10);   //constructor overloading
		shape1.area();
	

	}

}
