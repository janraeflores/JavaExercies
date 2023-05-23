/*
 * Exercise: Fibonacci Sequence
 *
 * Description: Write a function that generates the Fibonacci sequence up to a given number of terms. The Fibonacci sequence is a series of numbers in which each number is the sum of the two preceding ones, typically starting with 0 and 1.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSequence {
    public void start() {
        System.out.println("");
        System.out.println("Starting Sum of Two Numbers Exercise...");

        /*
         * Notes:
         * - Enter a number of terms
         * - A sequence where each number is the sum of the two preceding numbers
         * - Accept in a number of terms
         * - list out the series of numbers based on the number of terms
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many times terms: ");
        int terms = scanner.nextInt();

        ArrayList<Long> list = new ArrayList<Long>();

        long num1 = 0;
        list.add(num1);

        long num2 = 1;
        list.add(num2);

        for (int i = 0; i < terms; i++) {
            // Calculate for the following numbers
            long num3 = num1 + num2;
            list.add(num3);
            num1 = list.get(list.size() - 2);
            num2 = list.get(list.size() - 1);
        }

        System.out.println("The Fibonacci Sequence for: " + terms + " is : " + list);
    }
}
