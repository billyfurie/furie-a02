/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 William Furie
 */

package base;

import java.util.Scanner;

public class Solution07 {
    /*
        // Wrap the prompting and str -> double conversion in a method
        print "What is the length of the room in feet?"
        `length` = readString from user
        print "What is the width of the room in feet?"
        `width` = readString from user

        create Area object -- `roomArea` = Area(length, width)

        // using displayOutput method, roomArea.displayOutput()
        print "The area is"
        print "`roomArea.getArea()` square feet"
        print "`roomArea.getAreaMeters()` square meters"

     */

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution07 solution = new Solution07();

        double length = solution.getInputToDouble("What is the length of the room in feet? ");
        double width = solution.getInputToDouble("What is the width of the room in feet? ");

        Area floorArea = new Area(length, width);
        floorArea.displayOutput();
    }

    private double getInputToDouble(String prompt) {
        System.out.print(prompt);

        String userInput = input.nextLine();

        return Double.parseDouble(userInput);
    }
}
