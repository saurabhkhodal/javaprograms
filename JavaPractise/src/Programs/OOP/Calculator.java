package Programs.OOP;

public class Calculator {
	int sum =0;
	public void add( int a, int b) {
		 sum = a+b;
		 System.out.println("Sum is: "+sum);
	}
	
	public void add(int a, int b, int c) {
		sum = a+b+c;
		System.out.println("Sum is: "+sum);
	}
	
	public void add(double a, double b) {
		 double sum = a +b;
		 System.out.println("Sum is: "+sum);
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(10, 20);
		c.add(10, 20, 30);
		c.add(10.5, 20.3);

	}

}
