package Polymorphism;

public class BoxMain {

	public static void main(String[] args) {
		Box b = new Box();
		System.out.println(b.volume());

		Box b1 = new Box(12.5, 15.0, 12.5);
		System.out.println(b1.volume());
		
		Box b2 = new Box(11.0);
		System.out.println(b2.volume());
	}
}
