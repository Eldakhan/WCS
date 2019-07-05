package fr.wildcodeschool.java07;

public class Hangar {

	public static void main(String[] args) {

		Car car1 = new Car("randomBrand1", 0);
		Car car2 = new Car("randomBrand2", 10);
		Car car3 = new Car("randomBrand3", 100);
		Boat boat1 = new Boat("randomBrand4", 42);
		Boat boat2 = new Boat("randomBrand5", 1234567890);
		
		Vehicle[] vehicles = {car1, car2, car3, boat1, boat2};

		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle.doStuff());
		}
		
	}

}
