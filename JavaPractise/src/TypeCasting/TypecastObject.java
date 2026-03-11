package TypeCasting;

//Cat ct = (Cat) an;

class Animal {
	
}

class Dog extends Animal {}

class Cat extends Animal {}

public class TypecastObject {

	public static void main(String[] args) {
		
		//Rule 1: conversion is valid or not
		//the type of 'd' and 'c' must have some relationship (parent to child or vice versa)
		
	//	Animal an = new Dog();
	//	Cat ct = (Cat)an ;           //valid -> parent to child
	//Cat ct = (Cat) dg;          //not valid -> child to child
        
		
		//Rule 2: Assignment is valid or not
		// 'C' must be either same or child of 'A'
		
  //		Animal an = new Dog ();
  //  	Dog dg = (Dog)an ;       //valid
  //		Cat ct  = (Dog) an;      //invalid
  //		Animal dg = (Dog) an;    //invalid
		
	
		//Rule 3: 
		//The underlying object type of 'D' must be either same or child of 'C'
		Animal an = new Dog();
		Dog dg = (Dog)an ;     //valid
		Cat ct = (Cat)an;      //invalid
		
	}

}
