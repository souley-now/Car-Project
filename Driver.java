/**
 * Represents a driver of a car.
 * @author Souley
 *
 */
public class Driver {
	
	/**
	 * Person representing the driver.
	 */
	Person person;
	
	/**
	 * Indicates if driver has license.
	 */
	boolean hasLicense;
	
	/**
	 * Indicates if driver can only drive automatic transmission.
	 */
	boolean driveAutomaticOnly = false;
	
	/**
	 * Creates a driver with given name, age, license status, and if driver can only drive automatic transmission.
	 * @param name of driver
	 * @param age of driver
	 * @param hasLicense status for driver
	 * @param driveAutomaticOnly status for driver
	 */
	public Driver(String name, int age, boolean hasLicense, boolean driveAutomaticOnly) {
		this.person = new Person(name, age);
		this.driveAutomaticOnly = driveAutomaticOnly;
	}
	
	/**
	 * Returns name of driver.
	 * @return name
	 */
	String getName() {
		return this.person.name;
	}

	/**
	 * Returns age of driver.
	 * @return age
	 */
	int getAge() {
		return this.person.age;
	}

}
