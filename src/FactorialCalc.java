/*
 * Exercvise: Factorial Calculation
 *
 * Description: Write a function that calculates and returns the factorial of a given number. The factorial of a non-negative integer n is the product of all positive integers less than or equal to n.
 */

import java.util.Scanner;

public class FactorialCalc {
    public void start() {
        System.out.println("");
        System.out.println("Starting Factorial Calculation Exercise...");
        System.out.println("*** Input '0' to return to main menu **");
        System.out.print("Input number: ");

        /*
         * Notes:
         * - A factorial is used to calculate the product of an integer and all the positive integers below it.
         *  - n! = n * (n-1) * (n-2) * ...
         *  - First, we will need to read in the number that is going to be used to calculate
         *  - Then based on the above representation of calculating the factorial, we calculate the result
         *  - Probably loop till the user wants to exit the exercise
         */

         Scanner numInput = new Scanner(System.in);
         int factNum;

         do {
            factNum = numInput.nextInt();
            int factResult = 1;

            for (int i = 1; i <= factNum; i++) {
                factResult *= i;
            }

            System.out.println("Factorial Result: " + factResult);
            System.out.print("Input number for new calculation: ");
         } while (factNum != 0);

    }
}
