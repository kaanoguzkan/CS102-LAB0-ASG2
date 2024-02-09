import java.util.Scanner;

public class menuManager {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numberArray = arrayMethods.createRandomIntArray(5);

        int userInput = 0;
        do {
            System.out.println("-------------------------------------");
            System.out.println("[1] Find minimum & maximum values");
            System.out.println("[2] Find average & deviation");
            System.out.println("[3] Find sums of odd and even indices");
            System.out.println("-------------------------------------");

            do {
                System.out.print("Select operation: ");

                if (in.hasNextInt()) {
                    userInput = in.nextInt();
                    if (userInput < 1 || userInput > 3) {
                        System.out.println("Invalid input.");
                        in.nextLine();
                    }

                } else {
                    System.out.println("Invalid input.");
                    in.nextLine();
                }

            } while (userInput < 1 || userInput > 3);



            if (userInput == 1) {
                System.out.println("Maximum value: " + arrayMethods.findMax(numberArray));
                System.out.println("Minimum value: " + arrayMethods.findMin(numberArray));

            } else if (userInput == 2) {
                System.out.println("Average: " + arrayMethods.findAverage(numberArray));
                System.out.println("Deviations " + arrayMethods.findDeviations(numberArray));

            } else {
                System.out.println("Sum of even indices: " + arrayMethods.findSumOfEven(numberArray));
                System.out.println("Sum of odd indices: " + arrayMethods.findSumOfOdd(numberArray));
            }
            
        } while (userInput > 0);

        in.close();
    }
}
