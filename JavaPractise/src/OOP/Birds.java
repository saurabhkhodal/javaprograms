package OOP;

import Encapsulation.A;

public class Birds{
 
	//intitialize object using reference variable
	String colour;
	int age;
//	 public void fly() {
//		 System.out.println("I am flying");
//	 }
	 
//	 //initialize using method
//	 void initiObj(String c, int a) {
//		 colour = c;
//		 age =a;
//	 }
	 
	 //initialize an object using the constructor -> it is efficient way to initialize an object. if the number of objects are more
	 
	 public Birds(String colour1, int age1) {
		 this.colour= colour1;
		 this.age = age1;
	 }
	 

	 
	 void display() {
		 System.out.println(colour +" "+ age);
	 }
	 
	 public static void main(String []args) {
//		 Birds sparrow = new Birds();
//		 sparrow.colour = "Green";         //initialize object using reference variable
//		 sparrow.age = 2;
//		 
//		 System.out.println(sparrow.colour +" " + sparrow.age);
		 
//		 sparrow.initiObj("Black", 3);
//		 sparrow.display();
		 
		 Birds Sparrow = new Birds ("Black",2);
		 Birds parrot = new Birds("Green",1);
		 
		 Sparrow.display();
		 parrot.display();
		 
		 
		 
	 }
}
