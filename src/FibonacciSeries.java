/**
 * @class: FibonacciSeries
 * @authour: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: March 10, 2023
 * @description: This is a Java program that generates the first 30 values in the Fibonacci series.
 */

public class FibonacciSeries {
    public static void main(String[] args) {
        // The program initializes an integer n to 30 and creates an integer array called fibonacci of size n.
        int n = 30;
        //The first two values of the Fibonacci sequence (0 and 1) are manually inserted into the array.
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        //A for loop is then used to calculate and store the next 28 values of the sequence using the previous two values.
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        //Finally, another for loop is used to print the entire array of 30 Fibonacci values to the console.
        System.out.print("The first 30 values in the Fibonacci series are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
