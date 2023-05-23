/*
 * Exercise: Sum of Even Numbers
 *
 * Description: Write a function that takes a list of numbers as input and returns the sum of all the even numbers in the list. Test the function with different input values and print the results.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class SumOfEvenNum {
    public void start() {
        /*
         * Notes:
         * - Take in a list of numbers
         * - Delimit ",", " " , etc
         * - Gather all even numbers in the list
         * - Sum up all the even numbers in the list
         * - Print the result
         */

        String numbers = "12, String, test, 14, 18, 17, 19, 20";
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        int sumOfEvenNum = 0;

        String[] stringArray = numbers.split("[, ]+");
        for (int i = 0; i < stringArray.length; i++) {
            if (isNumber(stringArray[i])) {
                int arrayNum = Integer.parseInt(stringArray[i]);
                if (arrayNum % 2 == 0) {
                    evenNumbers.add(arrayNum);
                }
            }
        }

        for (int x = 0; x < evenNumbers.size(); x++) {
            sumOfEvenNum += evenNumbers.get(x).intValue();
        }

        System.out.println("The sum of all the even numbers is " + sumOfEvenNum);
    }

    private static boolean isNumber(String input) {
        return Pattern.matches("-?\\d+", input);
    }
}
