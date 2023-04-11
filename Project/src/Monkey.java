/**
 *  A class representing a monkey including species, tail length, height, and body length
 *
 * @author Asia Peters
 * @version 1.0
 */
public class Monkey extends RescueAnimal {

    // Instance Variables
    private String species;
    private String tailLength;
    private String height;
    private String bodyLength;

    /**
     * Constructor initializing name, species, tail length, height, body length, gender, age, weight,
     * acquisition date, acquisition country, training status, reserved status,
     * and in service country
     * @param name Monkey's name
     * @param species Monkey's species
     * @param gender Monkey's gender
     * @param age Monkey's age
     * @param weight Monkey's weight
     * @param tailLength Monkey's tail length
     * @param height Monkey's height
     * @param bodyLength Monkey's body length
     * @param acquisitionDate Monkey's acquisition date
     * @param acquisitionCountry Monkey's acquisition country
     * @param trainingStatus Monkey's training status
     * @param reserved Monkey's reserved status
     * @param inServiceCountry Monkey's in service country
     */
    public Monkey(String name, String species, String gender, String age,
    String weight, String tailLength, String height, String bodyLength,
    String acquisitionDate, String acquisitionCountry, String trainingStatus,
    boolean reserved, String inServiceCountry) {
        setName(name);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setHeight(height);
        setWeight(weight);
        setBodyLength(bodyLength);
        setTailLength(tailLength);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

    }

    // Accessor Methods
    /**
     * set the species of monkey to species:species
     * @param species Monkey's species
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * sets the tail length of monkey to tailLength:tailLength
     * @param tailLength Monkey's tail length
     */
    public void setTailLength(String tailLength) {
        this.tailLength = tailLength;
    }

    /**
     * sets the height of monkey to height:height
     * @param height Monkey's height
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * Set's body length of monkey to bodyLength:bodyLength
     * @param bodyLength Monkey's body length
     */
    public void setBodyLength(String bodyLength) {
        this.bodyLength = bodyLength;
    }

    // Mutator Methods
    /**
     * Return's the monkey's species
     * @return a string value representing the monkey's species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * Returns the tail length of monkey
     * @return a string value representing the monkey's tail length
     */
    public String getTailLength() {
        return tailLength;
    }

    /**
     * Returns the height of monkey
     * @return a string value representing the monkey's height
     */
    public String getHeight() {
        return height;
    }

    /**
     * Returns the body length of monkey
     * @return a string value representing the monkey's body length
     */
    public String getBodyLength() {
        return bodyLength;
    }

    // Print Method
    /**
     * Prints info about monkey
     * @see RescueAnimal#printInfo() Another method that prints animal info for animals
     * @see Monkey#printInfo() Another method that prints animal info for monkeys
     */
    @Override
    public void printInfo() {
        System.out.println("* " + getName());
        System.out.println("\tSpecies: " + species);
        super.printInfo();
    }
}
