package Abstraction;


//we cannot create the object of an abstract class.
//we can create the constructor of an abstract class but we cannot call it
//we can create a static method in abstract class but we cannot create abstract static methods
public class Main {

	public static void main(String[] args) {
Son son = new Son();
son.career();
son.partner();

Daughter daughter = new Daughter();
daughter.career();
daughter.partner();
	
	
	}

}
