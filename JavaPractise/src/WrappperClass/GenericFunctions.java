package WrappperClass;

public class GenericFunctions {
	static <T> void GenericDisplay(T element) {
		System.out.println(element.getClass().getName() + "="+ element);
	}
	public static void main(String[] args) {
		GenericDisplay(26);
		GenericDisplay("Saurabh Khodal");
		GenericDisplay(9.8);
	}

}
