/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 William Furie
 */

package base;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution14 {

    /*

        // Use method to convert Strings to Doubles
        cost = "What is the order amount? "
        state = "What is the state? "

        constant WISCONSIN_TAX_RATE = 0.055
        constant WISCONSIN = "WI"

        displayReceipt(cost, state)
            total = cost

            if state == WISCONSIN
                tax = cost * WI_TAX_RATE
                total += tax
                print "The subtotal is $`cost`."
                print "The tax is $`tax`."

            print "The total is $`total`."
     */

    private static final String WISCONSIN = "WI";
    private static final double WISCONSIN_TAX_RATE = 0.055;
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Solution14 solution = new Solution14();

        double cost = solution.getInputToDouble("What is the order amount? ");
        String state = solution.getInput("What is the state? ");

        solution.displayReceipt(cost, state);
    }

    private void displayReceipt(double cost, String state) {
        double total = cost;
        String receipt = "";

        DecimalFormat dollar = new DecimalFormat("0.00");

        if (state.equals(WISCONSIN)) {
            double tax = cost * WISCONSIN_TAX_RATE;
            total += tax;
            receipt += "The subtotal is $" + dollar.format(cost) + ".\n";
            receipt += "The tax is $" + dollar.format(tax) + ".\n";
        }

        receipt += "The total is $" + dollar.format(total) + ".\n";
        System.out.print(receipt);
    }

    private String getInput(String prompt) {
        System.out.print(prompt);

        return input.nextLine();
    }

    private double getInputToDouble(String prompt) {
        System.out.print(prompt);

        String userInput = input.nextLine();

        return Double.parseDouble(userInput);
    }
}
