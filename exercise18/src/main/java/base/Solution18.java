/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 William Furie
 */

package base;

import java.util.Scanner;

public class Solution18 {

    /*
        getTempUnit()
            print "Press C to convert from Fahrenheit to Celsius.
                   Press F to convert from Celsius to Fahrenheit.
                   Your choice: "
        getOriginalTemp(unit)
            number = print "Please enter the temperature in `unit`: "

            temp = getNewTemp(number, unit)

            print "The temperature in `other unit` is `temp`"

        getNewTemp(number, unit)
            if unit == FAHRENHEIT
                return (number - 32) * 5 / 9
            else
                return (number * 9 / 5) + 32
     */

    private static final Scanner input = new Scanner(System.in);

    private static final String FAHRENHEIT = "Fahrenheit";
    private static final String CELSIUS = "Celsius";
    private static final char FAHRENHEIT_SYMBOL = 'F';
    private static final char CELSIUS_SYMBOL = 'C';

    public static void main(String[] args) {
        Solution18 solution = new Solution18();

        char origUnit = solution.getTempUnitSymbol();
        double origTemp = solution.getOriginalTemp(origUnit);

        solution.displayNewTemp(origTemp, origUnit);
    }

    private char getTempUnitSymbol() {
        System.out.printf("Press C to convert from Fahrenheit to Celsius.%nPress F to convert from Celsius to Fahrenheit.%nYour choice: ");

        String unit = input.nextLine();

        char unitSymbol = unit.charAt(0);

        return Character.toUpperCase(unitSymbol);
    }

    private double getOriginalTemp(char unit) {
        String comp = getComplementUnit(unit);

        System.out.printf("Please enter the temperature in %s: ", comp);

        return Double.parseDouble(input.nextLine());
    }

    private double getNewTemp(double temp, String unit) {
        if (unit.equals(FAHRENHEIT)) {
            return (temp - 32) * 5 / 9;
        } else {
            return (temp * 9 / 5) + 32;
        }
    }

    private void displayNewTemp(double temp, char unit) {
        String unitStr = getUnit(unit);

        double newTemp = getNewTemp(temp, getComplementUnit(unit));

        System.out.printf("The temperature in %s is %.2f.", unitStr, newTemp);
    }

    private String getComplementUnit(char unit) {
        if (unit == FAHRENHEIT_SYMBOL) {
            return CELSIUS;
        } else {
            return FAHRENHEIT;
        }
    }

    private String getUnit(char unit) {
        if (unit == FAHRENHEIT_SYMBOL) {
            return FAHRENHEIT;
        } else {
            return CELSIUS;
        }
    }
}
