/*
 * Exercise: Reverse a String
 *
 * Description: Write a function that takes a string as input and returns the reverse of that string. For example, if the input is "hello", the function should return "olleh".
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseString {
    public void start() {
        System.out.println("");
        System.out.println("Starting Reverse String Exercise...");

        /*
         * Notes:
         * - Neet to accept a string input
         * - Read each character from string input
         * - Add each character to an ArrayList
         * - Display output string
         */

         Scanner scanner = new Scanner(System.in);

         System.out.print("Enter a String to reverse: ");
         String input = scanner.nextLine();

         ArrayList<Character> inOrderList = new ArrayList<Character>();
         StringBuilder reversedString = new StringBuilder();

         for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            inOrderList.add(c);
         }
         for (int i = inOrderList.size() - 1; i >= 0; i--) {
            char x = inOrderList.get(i);
            reversedString.append(x);
         }
        System.out.println("The string reversed is: " + reversedString);
    }
}
