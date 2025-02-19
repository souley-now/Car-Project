
/**
 * Class to manage cars, drivers, and passengers.
 * @author Souley
 *
 */
public class Cars {

	/**
	 * Car 1.
	 */
	Car car1;
	
	/**
	 * Car 2.
	 */
	Car car2;
	
	/**
	 * Car 3.
	 */
	Car car3;
	
	/**
	 * Runs the program by initializing and managing cars, drivers, and passengers.
	 */
	public void run() {
		
		//create driver
		Driver driver1 = new Driver("Souley", 23, true, false);
		
		//create car with given driver
		this.car1 = new Car("KIA", "FORTE", 145, "auto", driver1);
		
		//create passenger
		Passenger passenger1 = new Passenger("Sarah", 29, true);
		
		//add passenger to car
		this.car1.passenger1 = passenger1;
		
		//print driver name and age
		System.out.println("Driver name: " + car1.driver.getName());
		System.out.println("Driver age: " + car1.driver.getAge());
		
		System.out.println("_______________________________________");
		
		//create another driver
		Driver driver2 = new Driver("Anne", 93, false, false);
		
		//create another car with given driver
		this.car2 = new Car("Ford", "Pinto", 10, "manual", driver2);
		
		//create and add 3 passengers to car
		this.car2.passenger1 = new Passenger("Baby", 1, true);
		this.car2.passenger2 = new Passenger("Toddler", 3, true);
		this.car2.passenger3 = new Passenger("Baby", 1, true);
		
		//tell car2 to drive
		this.car2.drive();
		
		//print if passenger 1 and 2 are car sick
		System.out.println("Passenger 1 car sick: " + car2.passenger1.carSick);
		System.out.println("Passenger 2 car sick: " + car2.passenger2.carSick);
		
		//tell car2 to stop
		this.car2.stop();
		
		//print if passenger 1 and 2 are car sick
		System.out.println("Passenger 1 car sick: " + car2.passenger1.carSick);
		System.out.println("Passenger 2 car sick: " + car2.passenger2.carSick);
		
		System.out.println("_______________________________________");
		
		//create another driver
		Driver driver3 = new Driver("Brett", 36, true, true);
		
		//create another car with given driver
		this.car3 = new Car("Dodge", "Charger", 60, "auto", driver3);
		
		//create and add a passenger to car
		this.car3.passenger1 = new Passenger("Baby", 1, true);
		
		//set car 3 to drive
		car3.drive();
		
		//print if driver of car has license to drive!
		System.out.println("Does driver have license: " + car3.driver.hasLicense);
	}
	
	public static void printHello() {
		System.out.println("Welcome to the Cars app.");
	}
	
	public static void main(String[] args) {
		
		//call static method in Cars
		Cars.printHello();
		
		//create instance of cars class
		Cars cars = new Cars();

		//run the program
		cars.run();
		
		Driver driver1 = new Driver("Souley", 23, true, true);
		
		Car car1 = new Car("KIA", "FORTE", 3, "auto", driver1);
		Car car2 = new Car("toyota", "camry", 200, "auto", driver1);
		
		System.out.println();
		System.out.println(car1.equals(car2));
		
		System.out.println(car1);
		
	}

}
