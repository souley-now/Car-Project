/**
 * Represents a passenger of a car.
 * @author Souley
 *
 */
public class Passenger {

	/**
	 * Person representing the passenger.
	 */
	Person person;
	
	/**
	 * Indicates if passenger is car sick.
	 */
	boolean carSick = false;
	
	/**
	 * Creates passenger with given name, age, and license status.
	 * @param name of passenger
	 * @param age of passenger
	 * @param hasLicense status of passenger
	 */
	public Passenger(String name, int age, boolean hasLicense) {
		this.person = new Person(name, age);
	}
	
	/**
	 * Sets current status of car sickness.
	 * @param carSick
	 */
	void setCarSick(boolean carSick) {
		
		if (carSick) {
			System.out.println(this.getName() + " not feeling well ....");
		} else {
			System.out.println(this.getName() + " feeling good!");
		}
		
		this.carSick = carSick;
	}
	
	/**
	 * Returns name of passenger.
	 * @return name
	 */
	String getName() {
		return this.person.name;
	}

	/**
	 * Returns age of passenger.
	 * @return age
	 */
	int getAge() {
		return this.person.age;
	}
}
