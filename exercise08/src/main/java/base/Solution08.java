/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 William Furie
 */

package base;

import java.util.Scanner;

public class Solution08 {
    /*
        // Wrap the prompting and str -> int conversion in a method
        print "How many people?"
        `numPeople` = read string from user
        print "How many pizzas do you have?"
        `numPizzas` = read string from user
        print "How many slices per pizza?"
        `slicesPerPizza` = read string from user

        Handle this in a PizzaParty class

        `totalSlices` = `slicesPerPizza` * `numPizzas`
        `slicesPerPerson` = `totalSlices` / `numPeople` (int division)
        `slicesLeft` = `totalSlices` % `numPeople

        print "`numPeople` people with `numPizzas` pizzas (`totalSlices` slices)"
        print "Each person gets `slicesPerPerson` pieces of pizza."
        print "There are `slicesLeft` leftover pieces."
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numPeople = getInputToInt(input, "How many people? ");
        int numPizzas = getInputToInt(input, "How many pizzas do you have? ");
        int slicesPerPizza = getInputToInt(input, "How many slices per pizza? ");

        PizzaParty party = new PizzaParty(numPizzas, slicesPerPizza, numPeople);

        party.displayOutput();
    }

    private static int getInputToInt(Scanner input, String prompt) {
        System.out.print(prompt);

        String userInput = input.nextLine();

        return Integer.parseInt(userInput);
    }
}
