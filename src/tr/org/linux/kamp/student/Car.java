package tr.org.linux.kamp.student;

public class Car {
   
	private int gear;
    private int speed;
    private String brand;
    
    public Car(int gear,int speed,String brand) {
    	this.gear = gear;
    	this.brand = brand;
    	this.speed = speed;
    }
	
   
    public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void changeGear(int gear) {
	    this.gear = gear; 
	}
	
   
       
   
}
