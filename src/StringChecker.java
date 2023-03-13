/**
 * @class: StringChecker
 * @authour: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: March 10, 2023
 * @description: This program should first display if string 1 is has a greater length than string 2.
 * The program should also display if string 1 appears after string 2 in the lexicographic order or vice versa or if they are the same.
 * Lastly, the program should display a sentence created by combining both the string values.
 */

import java.util.Scanner;

public class StringChecker {
    // Defining the main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Prompting the user to enter the first string and storing it in a variable
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        // Prompting the user to enter the second string and storing it in a variable
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        int len1 = str1.length();
        int len2 = str2.length();
        // Boolean evaluation comparing the lengths of the two strings and displaying the result
        if (len1 > len2) {
            System.out.println("The first string is longer than the second string.");
        } else if (len1 < len2) {
            System.out.println("The second string is longer than the first string.");
        } else {
            System.out.println("The two strings have the same length.");
        }
        // Comparing the lexicographic order of the two strings and displaying the result
        int lexOrder = str1.compareTo(str2);
        if (lexOrder < 0) {
            System.out.println("The first string appears before the second string in the lexicographic order.");
        } else if (lexOrder > 0) {
            System.out.println("The second string appears before the first string in the lexicographic order.");
        } else {
            System.out.println("The two strings are the same in the lexicographic order.");
        }
        // Concatenating the two strings to form a sentence and displaying the result
        String sentence = str1 + " " + str2;
        System.out.println("The sentence formed by concatenating the two strings is: " + sentence);
    }

}
