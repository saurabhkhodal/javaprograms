package OOP;

public class Constructors {
	
//	Constructors(){
//		System.out.println("No argument constructor");
//	}
	
	Constructors(String name,int emp_id){
		this.i = emp_id;
		this.s = name;
	}

	int i;
	String s;
	public static void main(String[] args) {
		
//     Default constructor ---> compiler creates the default constructor
//	   Constructors c = new Constructors();
//	   System.out.println(c.i+ " "+ c.s);
		
		//No argument constructor ---> It is created by the programmer
//		Constructors c = new Constructors();
		
		//Parameterized constructor
		Constructors c1 = new Constructors("Saurabh" , 240);
		Constructors c2 = new Constructors("Harshal", 241);
		Constructors c3 = new Constructors("Hari", 242);
		Constructors c4 = new Constructors("Komal", 243);

		
		System.out.println("Employee 1 name: "+c1.s+ " emp id: "+c1.i);
		System.out.println("Employee 2 name: "+c2.s+ " emp id: "+c2.i);
		System.out.println("Employee 3 name: "+c3.s+ " emp id: "+c3.i);
		System.out.println("Employee 4 name: "+c4.s+ " emp id: "+c4.i);
	}

}
