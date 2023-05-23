import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int selected_exercise;

        do {
            System.out.println("");
            displayMenu();
            selected_exercise = input.nextInt();

            switch (selected_exercise) {
                case 0:
                    System.out.println("Exiting...");
                    break;
                case 1:
                    FizzBuzz fizzBuzz = new FizzBuzz();
                    fizzBuzz.start();
                    break;
                case 2:
                    FactorialCalc factCalc = new FactorialCalc();
                    factCalc.start();
                    break;
                case 3:
                    PalindromeChecker palindromeChecker = new PalindromeChecker();
                    palindromeChecker.start();
                    break;
                case 4:
                    SumOfTwo sumOfTwo = new SumOfTwo();
                    sumOfTwo.start();
                    break;
                case 5:
                    FibonacciSequence fibonacciSequence = new FibonacciSequence();
                    fibonacciSequence.start();
                    break;
                case 6:
                    ReverseString reverseString = new ReverseString();
                    reverseString.start();
                    break;
            }
        } while (selected_exercise != 0);
    }

    public static void displayMenu() {
        System.out.println("Software Development Exercises");
        System.out.println("--------------------------------");
        System.out.println("1: FizzBuzz");
        System.out.println("2: Factorial Calculation");
        System.out.println("3: Palindrome Checker");
        System.out.println("4: Sum of Two Numbers");
        System.out.println("5: Fibonacci Sequence");
        System.out.println("6: Reverse String");
        System.out.println("0: EXIT");
    }
}
