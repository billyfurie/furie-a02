/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 William Furie
 */

package base;

import java.util.Scanner;

public class Solution12 {

    /*
        // Use method to convert Strings to Doubles
        `principal` = print "Enter the principal: "
        `rate` = print "Enter the rate of interest: "
        `years` = print "Enter the number of years: "

        `worth` = getWorth(principal, rate, years)

        getWorth(principal, rate, years)
            `worth` = `principal` * (1 + `rate` * `years`)
            `worth` = roundUpPenny(`worth`)

            return principal

        roundUpPenny(worth)
            return 0.01 * Math.ceil(worth * 100)

        print ("After `years` years at `rate`%, the investment will be worth $`worth`."
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double principal = getInputToDouble(input, "Enter the principal: ");
        double ratePercent = getInputToDouble(input, "Enter the rate of interest: ");
        double rateDecimal = ratePercent / 100;
        int years = getInputToInt(input, "Enter the number of years: ");

        double worth = getWorth(principal, rateDecimal, years);

        System.out.printf("After %d years at %.3f%%, the investment will be worth $%.2f.", years, ratePercent, worth);
    }

    private static double getWorth(double principal, double rate, int years) {
        double worth = principal * (1 + rate * years);
        worth = roundUpPenny(worth);

        return worth;
    }

    private static double roundUpPenny(double worth) {
        return 0.01 * Math.ceil(worth * 100);
    }

    private static double getInputToDouble(Scanner input, String prompt) {
        System.out.print(prompt);

        String userInput = input.nextLine();

        return Double.parseDouble(userInput);
    }

    private static int getInputToInt(Scanner input, String prompt) {
        System.out.print(prompt);

        String userInput = input.nextLine();

        return Integer.parseInt(userInput);
    }
}
