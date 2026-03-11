package Interfaces;

public class NiceCar {
  private Engine engine;
  private Media player ;
  
  public NiceCar() {
	  engine = new PowerEngine();
	  player = new CdPlayer();
	  
  }
  
	  public NiceCar(Engine engine) {
		  this.engine = engine;
  }
	  
	  public void start() {
		  engine.start();
	  }
	  
	  public void stop() {
		  engine.stop();
	  }
	  
	  public void accelerate() {
		  engine.accelerate();
	  }
	  
	  public void startMusic() {
		  player.start();
	  }
	  
	  public void stopMusic() {
		  player.stop();
	  }
	  
	  public void upgradeEngine() {
		  this.engine = new ElectricEngine();
		  this.player = new DvdPlayer();
	  }
}
