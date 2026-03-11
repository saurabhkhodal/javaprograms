package List;

import java.util.Stack;

public class StackBasics {

	public static void main(String[] args) {
		Stack <String> animals = new Stack <>();
		
		animals.push("Lion");                         //to add the element in the stack
		animals.push("Tiger");
		animals.push("Horse");
		animals.push("Dog");
		animals.push("Cat");
		
	  System.out.println(animals);                    
	  animals.peek();                                // to see the topmost element in the stack 
	  System.out.println(animals.peek());
	   
	  animals.pop();                                 //to remove the topmost element from the stack
	  System.out.println(animals.peek());
		

	}

}
