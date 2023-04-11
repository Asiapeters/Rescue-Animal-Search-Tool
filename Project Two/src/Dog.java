/**
 *  A class representing a dog including breed
 *
 * @author Asia Peters
 * @version 1.0
 */
public class Dog extends RescueAnimal {

    private String breed;

    /**
     * Constructor initializing name, breed, gender, age, weight,
     * acquisition date, acquisition country, training status, reserved status,
     * and in service country
     * @param name Dog's name
     * @param breed Dog's breed
     * @param gender Dog's gender
     * @param age Dog's age
     * @param weight Dog's weight
     * @param acquisitionDate Dog's acquisition date
     * @param acquisitionCountry Dog's acquisition country
     * @param trainingStatus Dog's training status
     * @param reserved Dog's reserved status
     * @param inServiceCountry Dog's in service country
     */
    public Dog(String name, String breed, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

    }

    // Accessor Method
    /**
     * Returns dog's breed
     * @return an string value representing the dog's breed
     */
    public String getBreed() {
        return breed;
    }

    // Mutator Method
    /**
     * sets the breed to breed:dogBreed
     * @param dogBreed dog's breed
     */
    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }

    /**
     * Prints info about dog
     * @see Dog#printInfo() Another method that prints animal info for dogs
     * @see Monkey#printInfo() Another method that prints animal info for monkeys
     */
    @Override
    public void printInfo() {
        System.out.println("* " + getName());
        System.out.println("\tBreed: " + breed);
        super.printInfo();
    }
}
