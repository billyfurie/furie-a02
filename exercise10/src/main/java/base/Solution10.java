/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 William Furie
 */

package base;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution10 {
    /*
        constant TAX_RATE = 0.055

        // Repeat for all 3 items
        getPrice("Enter the price of item 1: ")
            `price` = user input
            process the string to a float
            return `price`

        getQuantity("Enter the quantity of item 1: ")
            `quantity` = user input
            process the string to a float
            return `quantity`

        getItemCost(price, quantity)
            return `price` * `quantity`

        getSubtotal(cost1, cost2, cost3)
            return `cost1` + `cost2` + `cost3`

        getTax(subtotal)
            return `subtotal` * `TAX_RATE`

        getTotal(subtotal, tax)
            return `subtotal` + `tax`

        getReceipt(subtotal, tax, total)
            print "Subtotal: $`subtotal`
                   Tax: $`tax`
                   Total: $`total`"

     */

    private static final double TAX_RATE = 0.055;
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution10 solution = new Solution10();

        double price1 = solution.getPrice(1);
        int quantity1 = solution.getQuantity(1);

        double price2 = solution.getPrice(2);
        int quantity2 = solution.getQuantity(2);

        double price3 = solution.getPrice(3);
        int quantity3 = solution.getQuantity(3);

        double cost1 = solution.getItemCost(price1, quantity1);
        double cost2 = solution.getItemCost(price2, quantity2);
        double cost3 = solution.getItemCost(price3, quantity3);

        double subtotal = solution.getSubtotal(cost1, cost2, cost3);
        double tax = solution.getTax(subtotal);
        double total = solution.getTotal(subtotal, tax);

        String receipt = solution.getReceipt(subtotal, tax, total);

        System.out.print(receipt);

    }

    private double getPrice(int itemNumber) {
        System.out.printf("Enter the price of item %d: ", itemNumber);

        String userInput = input.nextLine();

        return Double.parseDouble(userInput);
    }

    private int getQuantity(int itemNumber) {
        System.out.printf("Enter the quantity of item %d: ", itemNumber);

        String userInput = input.nextLine();

        return Integer.parseInt(userInput);
    }

    private double getItemCost(double price, int quantity) {
        return price * quantity;
    }

    private double getSubtotal(double ...cost) {
        double subtotal = 0;
        for (double i: cost) {
            subtotal += i;
        }
        return subtotal;
    }

    private double getTax(double subtotal) {
        return subtotal * TAX_RATE;
    }

    private double getTotal(double subtotal, double tax) {
        return subtotal + tax;
    }

    private String getReceipt(double subtotal, double tax, double total) {
        DecimalFormat df = new DecimalFormat("#.00");

        String receipt = "Subtotal: $" + df.format(subtotal);
        receipt += "\nTax: $" + df.format(tax);
        receipt += "\nTotal: $" + df.format(total);

        return receipt;
    }
}
