import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // for getting input
        Scanner keyboard = new Scanner(System.in);

        // for loop continuation - 1 represents true
        int continueOuterLoop = 1;
        int continueInnerLoop = 1;

        // for menu choice
        int menuChoice = 1;

        Tiger tiger = new Tiger();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();

        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    do {
                        System.out.println("The animal which is chosen is : " + tiger.getNameOfAnimal());
                        // get menu choice
                        menuChoice = animalDetailsManipulationMenu(keyboard, tiger);
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter age: ");
                                tiger.setAge(keyboard.nextInt());
                                System.out.println("Enter Height: ");
                                tiger.setHeight(keyboard.nextInt());
                                System.out.println("Enter Weight: ");
                                tiger.setWeight(keyboard.nextInt());
                                System.out.println("Enter the number of Stripes: ");
                                tiger.setNumberOfStripes(keyboard.nextInt());
                                System.out.println("Enter speed: ");
                                tiger.setSpeed(keyboard.nextInt());
                                System.out.println("Enter the sound level: ");
                                tiger.setSoundLevel(keyboard.nextInt());
                                break;
                            case 2:
                                System.out.println("Tiger Characteristics:");
                                System.out.println("Age: " + tiger.getAge());
                                System.out.println("Height: " + tiger.getHeight());
                                System.out.println("Weight: " + tiger.getWeight());
                                System.out.println("Number of Stripes: " + tiger.getNumberOfStripes());
                                System.out.println("Speed: " + tiger.getSpeed());
                                System.out.println("Sound level: " + tiger.getSoundLevel());
                                break;
                            case 3:
                                tiger.walking();
                                break;
                            case 4:
                                tiger.eatingFood();
                                tiger.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;
                case 2:
                    do {
                        System.out.println("The animal which is chosen is : " + dolphin.getNameOfAnimal());
                        // get menu choice
                        menuChoice = animalDetailsManipulationMenu(keyboard, dolphin);
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter age: ");
                                dolphin.setAge(keyboard.nextInt());
                                System.out.println("Enter Height: ");
                                dolphin.setHeight(keyboard.nextInt());
                                System.out.println("Enter Weight: ");
                                dolphin.setWeight(keyboard.nextInt());
                                System.out.println("Enter color: ");
                                dolphin.setColor(keyboard.next());
                                System.out.println("Enter Swimming speed: ");
                                dolphin.setSwimmingSpeed(keyboard.nextInt());
                                break;

                            case 2:
                                System.out.println("Dolphin Characteristics:");
                                System.out.println("Age: " + dolphin.getAge());
                                System.out.println("Height: " + dolphin.getHeight());
                                System.out.println("Weight: " + dolphin.getWeight());
                                System.out.println("Color: " + dolphin.getColor());
                                System.out.println("Swimming Speed: " + dolphin.getSwimmingSpeed());
                                break;
                            case 3:
                                dolphin.swimming();
                                break;
                            case 4:
                                dolphin.eatingFood();
                                dolphin.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;
                case 3:
                    do {
                        System.out.println("The animal which is chosen is : " + penguin.getNameOfAnimal());
                        // get menu choice
                        menuChoice = animalDetailsManipulationMenu(keyboard, penguin);
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter age: ");
                                penguin.setAge(keyboard.nextInt());
                                System.out.println("Enter Height: ");
                                penguin.setHeight(keyboard.nextInt());
                                System.out.println("Enter Weight: ");
                                penguin.setWeight(keyboard.nextInt());
                                System.out.println("Is the penguin swimming (true/false): ");
                                penguin.setSwimming(keyboard.nextBoolean());
                                System.out.println("Enter the walk speed of the penguin: ");
                                penguin.setWalkSpeed(keyboard.nextInt());
                                System.out.println("Enter the swim speed of the penguin: ");
                                penguin.setSwimSpeed(keyboard.nextInt());
                                break;

                            case 2:
                                System.out.println("Penguin Characteristics:");
                                System.out.println("Age: " + penguin.getAge());
                                System.out.println("Height: " + penguin.getHeight());
                                System.out.println("Weight: " + penguin.getWeight());
                                System.out.println("Walking Speed: " + penguin.getWalkSpeed());
                                System.out.println("Swimming Speed: " + penguin.getSwimSpeed());
                                break;
                            case 3:
                                if (penguin.isSwimming()) {
                                    System.out.println("Penguin is Swimming");
                                } else {
                                    System.out.println("Penguin is Walking");
                                }
                                break;
                            case 4:
                                penguin.eatingFood();
                                penguin.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;
                default:
                    System.out.println("Sorry no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();

        } while (continueOuterLoop == 1);
    }

    private static int animalChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");

        System.out.println("Enter choice of animal (1-3):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }
}
