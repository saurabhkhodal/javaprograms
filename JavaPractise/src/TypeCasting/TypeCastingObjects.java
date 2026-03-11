package TypeCasting;

	
	class Parent {
		String name;
		
		void m1() {
			name = "Sarang";
			System.out.println("This is parent "+name);
		}
	}
	
	class Child extends Parent {
		int id ;
		void m2() {
			id = 25;
			System.out.println("This is a child "+id);
		}
	}

	public class TypeCastingObjects {
	public static void main(String[] args) {
	/*	 Child c = new Child();
		 c.m2();
		 c.m1();
		System.out.println(c.name);
		System.out.println(c.id);
   */
	
	/*	
		Parent p = new Child();  //upcasting
		p.m1();
		System.out.println(p.name);
		
		p.m2();                      //we cannot access the value of child class directly as it is taking the reference of parent 
		System.out.println(p.id);
		
	*/	
		Parent m = new Parent();   //downcasting
		Child c = (Child)m;
		c.m2();
		c.m1();
		System.out.println(c.name);
		System.out.println(c.id);
		
		
	}

}
