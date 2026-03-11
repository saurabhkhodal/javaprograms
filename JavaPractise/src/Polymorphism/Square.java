package Polymorphism;

public class Square extends Shapes {
	
	//Static or compile time polymorphism -> achieved through the method overloading (same method name, different parameters (data types, no of args)
	
 Square(int side) {
	double area = side * side;
	System.out.println(area);
}
 
 public Square(int base, int height){
	 double area = 0.5*base*height;
 }
 

 
 Square(double radius){
	 double area = 3.14 * radius * radius;
 }
}
