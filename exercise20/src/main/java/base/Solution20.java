/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 William Furie
 */

package base;

import java.util.Scanner;

public class Solution20 {

    /*
        Class Resident(state, county)
            taxRate = 0

            if state is Wisconsin
                taxRate = .05

                if county is Eau Claire
                    taxRate += .005
                else if county is Dunn
                    taxRate += .004
            else if state is Illinois
                taxRate = .08

            getTaxAmount(orderAmount)
                return taxRate * orderAmount

            getTotal(orderAmount)
                return orderAmount + getTaxAmount(orderAmount)

            roundUpPenny(worth)
                return 0.01 * ceiling(worth * 100);
     */

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Solution20 solution = new Solution20();

        double orderAmount = solution.getOrderAmount();
        String state = solution.getLocationString("What state do you live in? " );
        String county = solution.getLocationString("What county do you live in? ");

        Resident guy = new Resident(state, county);

        double tax = guy.getTaxAmount(orderAmount);
        double total = guy.getTotal(orderAmount);

        solution.displayReceipt(tax, total);
    }

    private double getOrderAmount() {
        System.out.print("What is the order amount? ");

        String amount = input.nextLine();

        return Double.parseDouble(amount);
    }

    private String getLocationString(String prompt) {
        System.out.print(prompt);

        return input.nextLine();
    }

    private void displayReceipt(double tax, double total) {
        System.out.printf("The tax is $%.2f.%nThe total is $%.2f.", tax, total);
    }
}
