/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 William Furie
 */

package base;

import java.util.Scanner;

public class Solution09 {
    /*
        constant 1 `ONE_GALLON_AREA` covers 350 feet

        print "What is the length?"
        `length` = read string from user, convert to double
        print "What is the width?"
        `width` = read string from user, convert to double

        make a method to find area using these variables
            `area` = `length` * `width`
        make a method to find number of gallons needed
            `numGals` = ceiling of (`area` / `ONE_GALLON_AREA`)
        make a method to display the output
            "You will need to purchase `numGals` gallons of paint to cover `area` square feet."
     */

    private static final double ONE_GALLON_AREA = 350;
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution09 solution = new Solution09();

        double length = solution.getInputToDouble("What is the length? ");
        double width = solution.getInputToDouble("What is the width? ");
        double area = solution.getArea(length, width);
        int numGals = solution.getNumberOfGallons(area);

        solution.displayGallons(numGals, area);
    }

    private double getInputToDouble(String prompt) {
        System.out.print(prompt);

        String userInput = input.nextLine();

        return Double.parseDouble(userInput);
    }

    private double getArea(double length, double width) {
        return length * width;
    }

    private int getNumberOfGallons(double area) {
        return (int)Math.ceil(area / ONE_GALLON_AREA);
    }

    private void displayGallons(int gallons, double area) {
        System.out.printf("You will need to purchase %d gallons of paint to cover %.3f square feet.", gallons, area);
    }
}
