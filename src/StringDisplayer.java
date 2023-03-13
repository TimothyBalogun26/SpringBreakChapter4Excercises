/**
 * @class: StringDisplayer
 * @authour: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: March 10, 2023
 * @description: The program should find the last occurrence of the provided character in the provided String and display the corresponding index.
 */

import java.util.Scanner;

public class StringDisplayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompts the user to enter in a string value
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        //Prompts user to type in a character
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        int lastIndex = str.lastIndexOf(ch);
        // Boolean evaluation to depect what is printed from the evaluation below
        if (lastIndex == -1) {
            System.out.println("The character " + ch + " is not found in the string.");
        } else {
            System.out.println("The last occurrence of " + ch + " is at index " + lastIndex + ".");
        }
    }
}
