/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 William Furie
 */

package base;

import java.util.Scanner;

public class Solution17 {

    /*
        class Drinker(weight, gender)
            weight = weight
            gender = gender
            alcoholConsumed = 0
            timeSince = 0

            drink(amount, timeSince)
                alcoholConsumed += amount
                timeSince = timeSince

            getRatio()
                if gender == "male"
                    return RATIO_MALE
                else
                    return RATIO_FEMALE

            canDrive()
                ratio = getRatio()
                if BAC in legal limit
                    return True
                else
                    return False

            getBAC()
                BAC = (alcoholConsumed * 5.14 / weight * ratio) - 0.15 * timeSince

        isNumeric(string)
            try
                double num = Double.parseDouble(string)
                return true
            catch (NumberFormatException e)
                return false
    */

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution17 solution = new Solution17();

        int gender = (int)solution.getNumberFromInput(input, "Enter a 1 if you are male or a 2 if you are female: ");
        double alcoholAmount = solution.getNumberFromInput(input, "How many ounces of alcohol did you have? ");
        double weight = solution.getNumberFromInput(input, "What is your weight, in pounds? ");
        double timeSince = solution.getNumberFromInput(input, "How many hours has it been since your last drink? ");

        Drinker neighbor = new Drinker(gender, weight);
        neighbor.drink(alcoholAmount, timeSince);

        neighbor.displayBreathalyzer();
    }

    private double getNumberFromInput(Scanner input, String prompt) {
        System.out.print(prompt);

        String number = input.nextLine();

        while (!isNumeric(number)) {
            System.out.println("That's not numeric!");
            System.out.print(prompt);
            number = input.nextLine();
        }

        return Double.parseDouble(number);
    }

    private boolean isNumeric(String string) {
        if (string == null || string.equals("")) {
            return false;
        }

        try {
            Double.parseDouble(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
