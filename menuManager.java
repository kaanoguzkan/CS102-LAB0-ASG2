import java.util.Scanner; //Import Scanner library

public class menuManager {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //Create Scanner object

        //Get user input for array length
        int userInput = 0;
        do {
            System.out.print("Enter number: ");

            if (in.hasNextInt()) {
                userInput = in.nextInt();
                if (userInput < 1) {
                    System.out.println("Invalid input.");
                    in.nextLine();
                }

            } else {
                System.out.println("Invalid input.");
                in.nextLine();
            }

        } while (userInput < 1);
        
        int[] numberArray = arrayMethods.createRandomIntArray(userInput); //Create array

        //Get user input for operation selection
        do {
            System.out.println("-------------------------------------");
            System.out.println("[1] Find minimum & maximum values");
            System.out.println("[2] Find average & deviation");
            System.out.println("[3] Find sums of odd and even indices");
            System.out.println("  - Enter negative number to exit -  ");
            System.out.println("-------------------------------------");


            userInput = 0; //Reset input value

            System.out.print("Select operation: ");

            //Check for valid input, default to zero otherwise
            if (in.hasNextInt()) {
                userInput = in.nextInt();
                if (userInput > 3 || userInput == 0) {
                    System.out.println("Invalid input.");
                    userInput = 0;
                }

            } else {
                System.out.println("Invalid input."); 
            }
            in.nextLine(); //Clear input buffer


            //Call necessary functions, print results
            if (userInput == 1) {
                System.out.println("Maximum value: " + arrayMethods.findMax(numberArray));
                System.out.println("Minimum value: " + arrayMethods.findMin(numberArray));

            } else if (userInput == 2) {
                System.out.println("Average: " + arrayMethods.findAverage(numberArray));
                System.out.println("Deviations " + arrayMethods.findDeviations(numberArray));

            } else if (userInput == 3){
                System.out.println("Sum of even indices: " + arrayMethods.findSumOfEven(numberArray));
                System.out.println("Sum of odd indices: " + arrayMethods.findSumOfOdd(numberArray));
            }
            
        } while (userInput >= 0); //Exit loop if negative

        in.close(); //Close Scanner object
    }
}
