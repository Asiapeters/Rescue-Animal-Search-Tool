import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * This Program adds new rescue animals (monkey or Dog), changes reserved status,
 * and prints all animal types. This class contains the programs main() method.
 *
 * @author Asia Peters
 * @version 1.0
 */
public class Driver {
    private static final String[] countryCodes = Locale.getISOCountries();
    private static final ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static final ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();


    /**
     *  Prints menu and Prompts user for input to add new animal, print animals,
     *  reserve animal or quit.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        String command;
        Scanner scanner = new Scanner(System.in);
        initializeDogList();
        initializeMonkeyList();

        // Displays the menu amd accepts the users input
        do {
            displayMenu();
            command = scanner.nextLine();

            switch (command) {
                case "1":
                    intakeNewDog(scanner);
                    break;
                case "2":
                    intakeNewMonkey(scanner);
                    break;
                case "3":
                    reserveAnimal(scanner);
                    break;
                case "4":
                    printAnimals("dog");
                    break;
                case "5":
                    printAnimals("monkey");
                    break;
                case "6":
                    printAnimals("available");
                    break;
                case "q":
                    break;
                default:
                    System.out.println("Invalid Input");

            }
        } while (!command.equals("q"));
    }

    /**
     * prints the menu options
     */
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    /**
     * Adds dogs to a list for testing
     * @see #initializeMonkeyList() another method that adds animals for testing
     */
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");
        Dog dog4 = new Dog("Pluto", "Bloodhound", "male", "6", "35.6", "12-12-2016", "United States", "in service", false, "United States");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
        dogList.add(dog4);
    }

    /**
     * Adds monkeys to a list for testing
     * @see #initializeMonkeyList() another method that adds animals for testing
     */
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("George", "Capuchin", "male", "2", "3.5",
                "15.7", "13", "18.88", "07-25-2022",
                "United States", "in service", false, "United States");

        monkeyList.add(monkey1);
    }


    /**
     * Adds new dog to the list, checks that the dog is not already in the list,
     * and checks countries inputted are valid
     * @param scanner Enables obtaining input from user
     * @see #intakeNewDog(Scanner) another method that adds a new animal type to a list
     */
    public static void intakeNewDog(Scanner scanner) {
        String country = "";
        String inServiceCountry = "";
        boolean inputDone = false;
        boolean countryFound1 = false;
        boolean countryFound2 = false;
        boolean reservedStatus = false;

        // Prompts and gets dog's name from user
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();

        // Checks if dog's name is already in list
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Prompts and gets dog's breed from user
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();

        // Prompts and gets dog's gender from user
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();

        // Prompts and gets dog's age from user
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();

        // Prompts and gets dog's weight from user
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();

        // Prompts and gets dog's acquisition date from user
        System.out.println("What is the dog's acquisition date? (format: MM-DD-YYYY)");
        String date  = scanner.nextLine();

        // Loop to prompt user to enter correct country
        while (!countryFound1) {
            // Prompts and gets dog's acquisition location from user
            System.out.println("What is the dog's acquisition country?");
            country = scanner.nextLine();
            countryFound1 = findCountry(country);
        }

        // Prompts and gets dog's training status from user
        System.out.println("What is the dog's training status?");
        String trainingStatus = scanner.nextLine();

        // Loop to prompt user to enter correct country
        while (!countryFound2) {
            // Prompts and gets dog's in service location from user
            System.out.println("What is the dog's in service country?");
            inServiceCountry = scanner.nextLine();
            countryFound2 = findCountry(inServiceCountry);
        }


        // Loops to prompt user to input correct data
        while (!inputDone) {
            // Prompts and gets dog's reserved status from user
            System.out.println("Is this dog reserved? (True/False)");
            try {
                reservedStatus = scanner.nextBoolean();
                scanner.nextLine();
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter true or false\n");
                scanner.nextLine();
            }
        }


        // Creates dog
        Dog dog = new Dog(name, breed, gender, age, weight,date, country, trainingStatus,
                reservedStatus, inServiceCountry);

        // Adds dog to list
        dogList.add(dog);
        System.out.println("\n\nDog has been added\n\n");

    }


    /**
     * adds new monkey to list and checks if monkey is not already in list
     * to make sure the monkey doesn't already exist and the species type is allowed,
     * checks if country inputted is valid
     * @param scanner Enables obtaining input from user
     * @see #intakeNewMonkey(Scanner) another method that adds a new animal type to a list
     */
    public static void intakeNewMonkey(Scanner scanner) {
        String species;
        String country = "";
        String inServiceCountry = "";
        boolean inputDone = false;
        boolean reservedStatus = false;
        boolean countryFound1 = false;
        boolean countryFound2 = false;

        // Prompts and gets monkey's name from user
        System.out.println("What is the monkey's name?");
        String name = scanner.nextLine();

        // Checks if monkey's name is already in list
        for(Monkey monkey: monkeyList) {
            if (monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Prompts and gets monkey's species from user
        // Validates if species can be accepted
        System.out.println("What is the monkey's species?");
        species = scanner.nextLine();
        switch (species.toLowerCase()) {
            case "capuchin":
            case "guenon":
            case "macaque":
            case "marmoset":
            case "squirrel monkey":
            case "tamarin":
                break;
            default:
                System.out.println("\n\nSpecies not supported\n\n");
                return;
        }

        // Prompts and gets monkey's gender from user
        System.out.println("What is the monkey's gender?");
        String gender = scanner.nextLine();

        // Prompts and gets monkey's age from user
        System.out.println("What is the monkey's age?");
        String age = scanner.nextLine();

        // Prompts and gets monkey's weight from user
        System.out.println("What is the monkey's weight?");
        String weight = scanner.nextLine();

        // Prompts and gets monkey's height from user
        System.out.println("What is the monkey's height?");
        String height = scanner.nextLine();

        // Prompts and gets monkey's body length from user
        System.out.println("What is the monkey's body length?");
        String bodyLength = scanner.nextLine();

        // Prompts and gets monkey's tail length from user
        System.out.println("What is the monkey's tail length?");
        String tailLength = scanner.nextLine();

        // Prompts and gets monkey's acquisition date from user
        System.out.println("What is the monkey's acquisition date? (format: MM-DD-YYYY)");
        String date  = scanner.nextLine();

        // Loop to prompt user to enter correct country
        while (!countryFound1) {
            // Prompts and gets monkey's acquisition location from user
            System.out.println("What is the monkey's acquisition country?");
            country = scanner.nextLine();
            countryFound1 = findCountry(country);
        }

        // Prompts and gets monkey's training status from user
        System.out.println("What is the monkey's training status?");
        String trainingStatus = scanner.nextLine();

        // Loop to prompt user to enter correct country
        while (!countryFound2) {
            // Prompts and gets monkey's In service location from user
            System.out.println("What is the monkey's in service country?");
            inServiceCountry = scanner.nextLine();
            countryFound2 = findCountry(inServiceCountry);
        }

        // Loops to prompt user to input correct data
        while (!inputDone) {
            // Prompts and gets monkey's reserved status from user
            System.out.println("Is this monkey reserved? (True/False)");
            try {
                reservedStatus = scanner.nextBoolean();
                scanner.nextLine();
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter true or false\n");
                scanner.nextLine();
            }
        }

        // Creates monkey object
        Monkey monkey = new Monkey(name, species, gender, age, weight,tailLength,
                height,bodyLength, date, country, trainingStatus, reservedStatus,
                inServiceCountry);

        // Adds monkey to list
        monkeyList.add(monkey);
        System.out.println("\n\nMonkey has been added\n\n");
    }


    /**
     * Finds unreserved animals by animal type and in service country
     * Reserves first unreserved animal in list
     * @param scanner Enables obtaining input from user
     */
    public static void reserveAnimal(Scanner scanner) {
            // Prompts user for animal type
            System.out.println("Enter animal Type:");
            String type = scanner.nextLine();

            // Prompts user for in service country
            System.out.println("Enter in service country:");
            String country = scanner.nextLine();

            // Finds Available animals based on type and location that are not reserved
            // if unreserved animal is found it will be reserved
            if (type.equalsIgnoreCase("monkey")) {
                for (Monkey monkey : monkeyList) {
                    if (monkey.getInServiceLocation().equalsIgnoreCase(country) && !monkey.getReserved()) {
                        monkey.setReserved(true);
                        System.out.println("\n\n" + monkey.getName() + " is now Reserved\n\n");
                        return;
                    }
                }
            }
            else if (type.equalsIgnoreCase("dog")) {
                for (Dog dog: dogList) {
                    if (dog.getInServiceLocation().equalsIgnoreCase(country) && !dog.getReserved()) {
                        dog.setReserved(true);
                        System.out.println("\n\n" + dog.getName() + " is now Reserved\n\n");
                        return;
                    }
                }
            }

            // If no animals specified were found
            System.out.println("\n\nNo animals are available for animal type and location\n\n");
        }

    /**
     * Prints list of animals (name, breed/species, status, and acquisition country) based on
     * list type (dog, monkey, available)
     * Available list type will only print animals that are fully trained and are not reserved
     * @param listType type of animal category
     * @see RescueAnimal#printInfo() another method that prints animal info
     * @see Dog#printInfo() another method that prints dog info
     * @see Monkey#printInfo() another method that prints monkey info
     */
    public static void printAnimals(String listType) {
        switch (listType) {
            // Prints All Dogs
            case "dog":
                System.out.println("\nAll Dogs");
                for (Dog dog : dogList) {
                    dog.printInfo();
                }
                break;
            // Prints All Monkeys
            case "monkey":
                System.out.println("\nAll Monkeys");
                for (Monkey monkey : monkeyList) {
                    monkey.printInfo();
                }
                break;
            // Prints All animals that are in service and are not reserved
            case "available":
                System.out.println("Available Animals");
                for (Dog dog : dogList) {
                    if (!dog.getReserved() && dog.getTrainingStatus().equalsIgnoreCase("in service")) {
                        dog.printInfo();
                    }
                }
                    for (Monkey monkey : monkeyList) {
                        if (!monkey.getReserved() && monkey.getTrainingStatus().equalsIgnoreCase("in service")) {
                            monkey.printInfo();
                        }
                    }
                break;
        }
    }

    /**
     * Checks if country inputted is a valid country
     * @param country country inputted
     * @return a boolean (true) if country has been found (false) if not
     */
    public static boolean findCountry(String country) {
        for (String countryCode: countryCodes) {
            Locale countryObj  = new Locale("", countryCode);
            if (country.equalsIgnoreCase(countryObj.getDisplayCountry())) {
                return true;
            }
        }

        System.out.println("Invalid country\n");
        return false;
    }

}

