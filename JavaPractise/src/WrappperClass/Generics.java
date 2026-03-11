package WrappperClass;

public class Generics<S,K> {        //by using the generics we can store multiple type of values in the same class
	
	S obj1;
	K obj2;
	
	Generics(S obj1, K obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	public void print() {
		System.out.println(this.obj1);
		System.out.println(this.obj2);
	}

	public static void main(String[] args) {
		
		Generics <Integer, String> obj = new Generics<>(26,"Saurabh");
		obj.print();

	}

}
