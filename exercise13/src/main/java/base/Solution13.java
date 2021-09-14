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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double principal = getInputToDouble(input, "What is the principal amount? ");
        double ratePercent = getInputToDouble(input, "What is the rate? ");
        double rateDecimal = ratePercent / 100;
        int years = getInputToInt(input, "What is the number of years? ");
        int compounds = getInputToInt(input, "What is the number of times the interest is compounded per year? ");

        double worth = getWorth(principal, rateDecimal, years, compounds);

        System.out.printf("$%.2f invested at %.3f%% for %d years compounded %d times per year is $%.2f.", principal, ratePercent, years, compounds, worth);
    }

    private static double getWorth(double principal, double rate, int years, int compounds) {
        double base = 1 + rate / compounds;
        double power = compounds * years;
        double worth = principal * Math.pow(base, power);
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
