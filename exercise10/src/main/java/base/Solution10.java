/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double price1 = getPrice(input, 1);
        int quantity1 = getQuantity(input, 1);

        double price2 = getPrice(input, 2);
        int quantity2 = getQuantity(input, 2);

        double price3 = getPrice(input, 3);
        int quantity3 = getQuantity(input, 3);

        double cost1 = getItemCost(price1, quantity1);
        double cost2 = getItemCost(price2, quantity2);
        double cost3 = getItemCost(price3, quantity3);

        double subtotal = getSubtotal(cost1, cost2, cost3);
        double tax = getTax(subtotal);
        double total = getTotal(subtotal, tax);

        String receipt = getReceipt(subtotal, tax, total);

        System.out.print(receipt);

    }

    private static double getPrice(Scanner input, int itemNumber) {
        System.out.printf("Enter the price of item %d: ", itemNumber);

        String userInput = input.nextLine();

        return Double.parseDouble(userInput);
    }

    private static int getQuantity(Scanner input, int itemNumber) {
        System.out.printf("Enter the quantity of item %d: ", itemNumber);

        String userInput = input.nextLine();

        return Integer.parseInt(userInput);
    }

    private static double getItemCost(double price, int quantity) {
        return price * quantity;
    }

    private static double getSubtotal(double ...cost) {
        double subtotal = 0;
        for (double i: cost) {
            subtotal += i;
        }
        return subtotal;
    }

    private static double getTax(double subtotal) {
        return subtotal * TAX_RATE;
    }

    private static double getTotal(double subtotal, double tax) {
        return subtotal + tax;
    }

    private static String getReceipt(double subtotal, double tax, double total) {
        DecimalFormat df = new DecimalFormat("#.00");

        String receipt = "Subtotal: $" + df.format(subtotal);
        receipt += "\nTax: $" + df.format(tax);
        receipt += "\nTotal: $" + df.format(total);

        return receipt;
    }
}
