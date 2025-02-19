/**
 * Represents a car.
 * @author Souley
 *
 */
public class Car {

	/**
	 * Make of car.
	 */
	String make;
	
	/**
	 * Model of car.
	 */
	String model;
	
	/**
	 * Max sped of car.
	 */
	int maxSpeed;
	
	/**
	 * Transmission type of car.
	 */
	String transmission;
	
	/**
	 * State of car -- is it currently moving?
	 */
	boolean moving;
	
	/**
	 * Driver of car.
	 */
	Driver driver;
	
	/**
	 * Possible passengers of car.
	 */
	Passenger passenger1;
	Passenger passenger2;
	Passenger passenger3;
	
	/**
	 * Creates a car with given make, model, maxSpeed, transmission type, and driver.
	 * @param make of car
	 * @param model of car
	 * @param maxSpeed of car
	 * @param transmission type for car
	 * @param driver of car
	 */
	public Car(String make, String model, int maxSpeed, String transmission, Driver driver) {
		this.make = make;
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.transmission = transmission;
		this.driver = driver;
	}
	
	/**
	 * Tells car to start driving.
	 * Sets moving to true.
	 */
	void drive() {
		
		System.out.println("Car is moving!");
		
		this.moving = true;
		
		//make passenger 1 car sick
		this.passenger1.setCarSick(true);
	}
	
	/**
	 * Tells car to stop driving.
	 * Sets moving to false.
	 */
	void stop() {
		
		System.out.println("Car stopped!");
		
		this.moving = false;
		
		//make passenger 1 not car sick
		this.passenger1.setCarSick(false);
	}
	
	public boolean equals(Object something) {
		
		//cast something to Car
		Car otherCar = (Car) something;
		
		return this.make.equals(otherCar.make) && this.maxSpeed == otherCar.maxSpeed;
	}
	
	/**
	 * Represents a String version of car as make and model.
	 */
	public String toString() {
		return this.make + " " + this.model;
	}
	
}
