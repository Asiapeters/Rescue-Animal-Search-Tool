

import java.lang.String;

/**
 * Class represents rescue animal including name, animal type,
 * gender, age, weight, acquisition date / country, training status,
 * reserved status, and in service country
 *
 * @author Asia Peters
 * @version 1.0
 */
public class RescueAnimal {

    // Instance variables
    private String name;
    private String animalType;
    private String gender;
    private String age;
    private String weight;
    private String acquisitionDate;
    private String acquisitionCountry;
	private String trainingStatus;
    private boolean reserved;
	private String inServiceCountry;


	/**
	 * Default Constructor
	 */
	public RescueAnimal() {
    }

	// Accessor Methods

	/**
	 * returns name
	 * @return a string value representing the animal's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * returns animal type
	 * @return a string value representing the animal's type
	 */
	public String getAnimalType() {
		return animalType;
	}

	/**
	 * returns gender
	 * @return a string value representing the animal's gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * returns age
	 * @return a string value representing the animal's age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * returns weight
	 * @return a string value representing the animal's weight
	 */
	public String getWeight() {
		return weight;
	}

	/**
	 * returns acquisition date
	 * @return a string value representing the animal's acquisition date
	 */
	public String getAcquisitionDate() {
		return acquisitionDate;
	}

	/**
	 * returns acquisition country
	 * @return a string value representing the animal's acquisition country
	 */
	public String getAcquisitionLocation() {
		return acquisitionCountry;
	}

	/**
	 * returns reserved status
	 * @return a string value representing the animal's reserved status
	 */
	public boolean getReserved() {
		return reserved;
	}

	/**
	 * returns in service country
	 * @return a string value representing the animal's in service country
	 */
	public String getInServiceLocation() {
		return inServiceCountry;
	}

	/**
	 * returns training status
	 * @return a string value representing the animal's training status
	 */
	public String getTrainingStatus() {
		return trainingStatus;
	}

	// Mutator Methods

	/**
	 * sets the name of animal to name:animalName
	 * @param animalName name of animal
	 */
	public void setName(String animalName) {
		name = animalName;
	}

	/**
	 * sets the type of animal to animalType:type
	 * @param type animal type
	 */
	public void setAnimalType(String type) {
		this.animalType = type;
	}

	/**
	 * sets the gender of animal to gender: gender
	 * @param gender animal gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * sets the age of animal to age:age
	 * @param age animal age
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * sets the weight of animal to weight:weight
	 * @param weight animal weight
	 */
	public void setWeight(String weight) {
		this.weight = weight;
	}

	/**
	 * sets the acquisition date of animal to acquisitionDate:acquisitionDate
	 * @param acquisitionDate animal acquisition date
	 */
	public void setAcquisitionDate(String acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}

	/**
	 * sets the acquisition country of animal to acquisitionCountry:acquisitionCountry
	 * @param acquisitionCountry animal acquisition country
	 */
	public void setAcquisitionLocation(String acquisitionCountry) {
		this.acquisitionCountry = acquisitionCountry;
	}

	/**
	 * sets the reserved status of animal to reserved:reserved
	 * @param reserved animal reserved status
	 */
	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}

	/**
	 * sets the in service country of animal to reserved: reserved
	 * @param inServiceCountry animal in service country
	 */
	public void setInServiceCountry(String inServiceCountry) {
		this.inServiceCountry = inServiceCountry;
	}

	/**
	 * sets the training status of animal to trainingStatus:trainingStatus
	 * @param trainingStatus animal training status
	 */
	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}

	/**
	 * Prints info about dog
	 * @see RescueAnimal#printInfo() Another method that prints animal info
	 * @see Monkey#printInfo() Another method that prints animal info for monkeys
	 */
	public void printInfo(){
		System.out.println("\tGender: " + gender);
		System.out.println("\tStatus: " + trainingStatus);
		System.out.println("\tAcquisition Location: " + acquisitionCountry);
		System.out.println("\tReserved: " + reserved);
	}
}
