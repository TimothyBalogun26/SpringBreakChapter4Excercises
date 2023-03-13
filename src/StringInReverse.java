/**
 * @class: StringInReverse
 * @authour: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: March 10, 2023
 * @description: This program accepts a String value from the user and displays the reverse of that value.
 */

import java.util.Scanner;

public class StringInReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");

        // Read the user input and store it in a String variable called str
        String str = scanner.nextLine();

        // Initialize an empty string called reversedStr to store the reversed string
        String reversedStr = "";

        // Uses a for loop to iterate over the characters of the input string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        // Prints the reversed string
        System.out.println("The reversed string is: " + reversedStr);
    }
}
