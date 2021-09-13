/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 William Furie
 */

package base;

import java.util.Scanner;

public class Solution11 {

    /*
        // Use method to convert Strings to Doubles
        print "How many euros are you exchanging? "
        `euros` = read the string from user
        print "What is the exchange rate? "
        `rate` = read the string from user

        getDollars(c_from, rate)
            dollars = c_from * rate
            // rounds to the nearest hundredth
            dollars = 0.01 * ceiling(dollars * 100.0)

        print "`euros` euros at an exchange rate of `rate` is
               `dollars` U.S. dollars."
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double euros = getInputToDouble(input, "How many euros are you exchanging? ");
        double rate = getInputToDouble(input, "What is the exchange rate? ");

        double dollars = getDollars(euros, rate);

        System.out.printf("%.4f euros at an exchange rate of %.4f is %n%.2f U.S. dollars.", euros, rate, dollars);
    }

    private static double getDollars(double euros, double rate) {
        double dollars = euros * rate;

        return 0.01 * Math.ceil(dollars * 100);
    }

    private static double getInputToDouble(Scanner input, String prompt) {
        System.out.print(prompt);

        String userInput = input.nextLine();

        return Double.parseDouble(userInput);
    }
}
