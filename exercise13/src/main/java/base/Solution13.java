/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 William Furie
 */

package base;

import java.util.Scanner;

public class Solution13 {

    /*
        // Use method to convert Strings to Doubles
        `principal` = print "What is the principal amount? "
        `rate` = print "What is the rate? "
        `years` = print "What is the number of years? "
        `compounds` = print "What is the number of times the interest is compounded per year? "
        `worth` = getWorth(principal, rate, years, compoundsPerYear)

        getWorth(principal, rate, years)
            `worth` = `principal` * (1 + `rate` / `compounds`)^(`compounds` * `years`)
            `worth` = roundUpPenny(`worth`)
            return principal

        roundUpPenny(worth)
            return 0.01 * Math.ceil(worth * 100)

        print "$`principal` invested at `rate`% for `years` years compounded `compounds` times per year is $`worth`"
     */

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Solution13 solution = new Solution13();

        double principal = solution.getInputToDouble("What is the principal amount? ");
        double ratePercent = solution.getInputToDouble("What is the rate? ");
        double rateDecimal = ratePercent / 100;
        int years = solution.getInputToInt("What is the number of years? ");
        int compounds = solution.getInputToInt("What is the number of times the interest is compounded per year? ");

        double worth = solution.getWorth(principal, rateDecimal, years, compounds);

        System.out.printf("$%.2f invested at %.3f%% for %d years compounded %d times per year is $%.2f.", principal, ratePercent, years, compounds, worth);
    }

    private double getWorth(double principal, double rate, int years, int compounds) {
        double base = 1 + rate / compounds;
        double power = compounds * years;
        double worth = principal * Math.pow(base, power);
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
