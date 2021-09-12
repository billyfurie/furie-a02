/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double length = getInputToDouble(input, "What is the length of the room in feet? ");
        double width = getInputToDouble(input, "What is the width of the room in feet? ");

        Area floorArea = new Area(length, width);
        floorArea.displayOutput();
    }

    private static double getInputToDouble(Scanner input, String prompt) {
        System.out.print(prompt);

        String userInput = input.nextLine();

        return Double.parseDouble(userInput);
    }
}
