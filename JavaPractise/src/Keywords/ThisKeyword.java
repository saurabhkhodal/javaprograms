package Keywords;

public class ThisKeyword {
  
	int a,b;
	
	// constructor
	 ThisKeyword(int a, int b) {
		this.a = a;
		this.b = b;
	}


	
	//method
	void sum (int a, int b) {
 	this.a = a;
 	this.b = b;
 	
 	System.out.println("Sum: "+(a+b));
 	
	}
 	   int displaySum () {
 		return (a+b);
 	}

 	
}


