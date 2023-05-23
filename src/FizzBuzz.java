/*
 * Exercise: FizzBuzz
 *
 * Description: Write a program that prints the numbers from 1 to 100. But for multiples of three, print "Fizz" instead of the number, and for the multiples of five, print "Buzz". For numbers that are multiples of both three and five, print "FizzBuzz".
 */

public class FizzBuzz {
    public void start() {
        System.out.println("");
        System.out.println("Starting FizzBuzz Exercise...");

        /*
         * Notes:
         * - Loop through numbers 1 to 100
         * - If multiples of three = Fizz
         * - If multiples of five = Buzz
         * - If multiples of three and five = FizzBuzz
         * - All else, numbers print out
         */

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
