/**
 * @class: PatternPresenter
 * @authour: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: March 10, 2023
 * @description: This program is used to prompt users with a certain pattern
 */

public class PatternPresenter {
    public static void main(String[] args) {
        //For loop evaluation to help depict where the value of i applies to the correct sequence
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                // This will then prompt astericks in the correct order if evaluation applies
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
