package tr.org.linux.kamp.student;

public class CarFactory {

	public static void main(String[] args) {
		Car car1 = new Car(4,120,"fiesta");
		Car car2 = new Car(2,60,"focus");
		
		car1.setBrand("golf");
		car2.setGear(4);
		
		System.out.println(car1.getSpeed() + " " + car1.getBrand() + " " + car1.getGear());
		
		car1.changeGear(3);
		car1.speedUp(40);
	    
		System.out.println(car1.getSpeed() + " " + car1.getBrand() + " " + car1.getGear());
	}

}
