package oop;

public class CarController {

	public static void main(String[] args) {
		VWCar vw = new VWCar();
		vw.brand="VW";
		vw.numberOfDoors=2;
		vw.numberOfTires=4;
		System.out.println(vw);
		
		System.out.println(vw.turnRight());
		
		Beettle beettle = new Beettle();
		System.out.println(Car.WHEEL);
		System.out.println(beettle.turnRight());
		
		//save(beettle);
		
		
		
		

	}

}
