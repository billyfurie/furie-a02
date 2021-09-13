/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double length = getInputToDouble(input,"What is the length? ");
        double width = getInputToDouble(input,"What is the width? ");
        double area = getArea(length, width);
        int numGals = getNumberOfGallons(area);

        displayGallons(numGals, area);
    }

    private static double getInputToDouble(Scanner input, String prompt) {
        System.out.print(prompt);

        String userInput = input.nextLine();

        return Double.parseDouble(userInput);
    }

    private static double getArea(double length, double width) {
        return length * width;
    }

    private static int getNumberOfGallons(double area) {
        return (int)Math.ceil(area / ONE_GALLON_AREA);
    }

    private static void displayGallons(int gallons, double area) {
        System.out.printf("You will need to purchase %d gallons of paint to cover %.3f square feet.", gallons, area);
    }
}
