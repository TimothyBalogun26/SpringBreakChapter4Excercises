/**
 * @class: HighestAndLowestGrade
 * @authour: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: March 10, 2023
 * @description: This program is simply printing the highest and lowest grades, or a message if no grades were entered
 */

import java.util.Scanner;

public class HighestAndLowestGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Allows user to insert an integer in the terminal
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        boolean stop = false;
        while (!stop) {
            //Prompts user to type a grade in
            System.out.print("Enter a grade (or X to stop): ");
            String input = scanner.next();
            //boolean evaluation to depict whether grade is higher or lower
            if (input.equalsIgnoreCase("X")) {
                stop = true;
            } else {
                int grade = Integer.parseInt(input);
                if (grade > highest) {
                    highest = grade;
                }
                if (grade < lowest) {
                    lowest = grade;
                }
            }
        }
        //boolean evaluation for if grades were entered in or not. If not the else process will occur and run
        if (highest == Integer.MIN_VALUE) {
            System.out.println("No grades were entered.");
        } else {
            System.out.println("The highest grade is " + highest);
            System.out.println("The lowest grade is " + lowest);
        }
    }
}
