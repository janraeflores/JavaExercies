/*
 * Exercise: Sum of Two Numbers
 *
 * Description: Write a function that takes two numbers as input and returns their sum. Test the function with different input values and print the results.
 */

import java.util.Scanner;

public class SumOfTwo {
    public void start() {
        System.out.println("");
        System.out.println("Starting Sum of Two Numbers Exercise...");
        System.out.println("*** Input 'EXIT' to return to main menu **");

        /*
         * Notes:
         * - Take in two different sets of numbers
         * - Retrieve the value of the sum of the two numbers
         * - Validation of input values
         * - Output correct values
         */

        Scanner scanner = new Scanner(System.in);
        String firstInput;
        String secondInput;

        do {
            System.out.print("Enter first number: ");
            firstInput = scanner.nextLine();
            if (firstInput.equalsIgnoreCase("EXIT")) {
                break;
            }

            System.out.print("Enter second number: ");
            secondInput = scanner.nextLine();
            if (secondInput.equalsIgnoreCase("EXIT")) {
                break;
            }

            try {
                int number1 = Integer.parseInt(firstInput);
                int number2 = Integer.parseInt(secondInput);
                int result = number1 + number2;
                System.out.println("The sum is: " + result);
            } catch (Exception e) {
                System.out.println("Invalid input. Please input numbers. Try again.");
            }
        } while (true);
    }
}
