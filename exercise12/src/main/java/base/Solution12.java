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

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution12 solution = new Solution12();

        double principal = solution.getInputToDouble("Enter the principal: ");
        double ratePercent = solution.getInputToDouble("Enter the rate of interest: ");
        double rateDecimal = ratePercent / 100;
        int years = solution.getInputToInt("Enter the number of years: ");

        double worth = solution.getWorth(principal, rateDecimal, years);

        System.out.printf("After %d years at %.3f%%, the investment will be worth $%.2f.", years, ratePercent, worth);
    }

    private double getWorth(double principal, double rate, int years) {
        double worth = principal * (1 + rate * years);
        worth = roundUpPenny(worth);

        return worth;
    }

    private double roundUpPenny(double worth) {
        return 0.01 * Math.ceil(worth * 100);
    }

    private double getInputToDouble(String prompt) {
        System.out.print(prompt);

        String userInput = input.nextLine();

        return Double.parseDouble(userInput);
    }

    private int getInputToInt(String prompt) {
        System.out.print(prompt);

        String userInput = input.nextLine();

        return Integer.parseInt(userInput);
    }
}
