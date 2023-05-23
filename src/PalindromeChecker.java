/*
 * Exercise: Palindrome Checker
 *
 * Description: Write a function that checks whether a given string is a palindrome. A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward, ignoring spaces, punctuation, and letter casing.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeChecker {
    public void start() {
        System.out.println("");
        System.out.println("Starting Palindrome Checker...");
        System.out.println("*** Input 'EXIT' to return to main menu **");
        System.out.print("Input string: ");

        /*
         * Notes:
         * - Take in a string
         * - Read through the string
         * - Reverse the string
         * - Compare to the original string
         * - Loop through for different palindromes
         */

         Scanner scanner = new Scanner(System.in);
         String exit = "EXIT";
         String checkString;

         do {
            checkString = scanner.nextLine();

            if (checkString.equals(exit)) {
                break;
            }

            ArrayList<Character> inOrder = new ArrayList<Character>();
            ArrayList<Character> reverseOrder = new ArrayList<Character>();

            for (int i = 0; i < checkString.length(); i++) {
                inOrder.add(checkString.charAt(i));
             }
             for (int i = checkString.length() - 1; i >= 0; i--) {
                reverseOrder.add(checkString.charAt(i));
             }

             System.out.println(inOrder.equals(reverseOrder));
             System.out.print("Input next string: ");
         } while(true);
    }
}
