/**
 * @class: FactorialCalculator
 * @authour: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: March 10, 2023
 * @description: This is a Java program that calculates the factorial of a non-negative integer input by the user.
 */

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // The user is prompted to enter a non-negative integer and the value is stored in the variable n.
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();
        // An if statement checks whether the entered value is non-negative and prints an error message if it is not.
        if (n < 0) {
            System.out.println("Error: Entered value must be non-negative.");
        } else {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            // The calculated factorial is stored in the variable factorial and printed to the console.
            System.out.println(n + "! = " + factorial);
        }
    }
}
