package Interfaces;

public class Car implements Engine, Brake,Media {

	@Override
	public void brake() {
		System.out.println("I Brake like a normal car");
		
	}

	@Override
	public void start() {
		System.out.println("I Start Engine like a normal car");
		
	}

	@Override
	public void stop() {
		System.out.println("I Stop Engine like a normal car");
		
	}

	@Override
	public void accelerate() {
		System.out.println("I Accelerate like a normal car");
		
	}
	

	
	}


