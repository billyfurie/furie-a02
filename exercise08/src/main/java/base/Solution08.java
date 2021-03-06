/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
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

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Solution08 solution = new Solution08();

        int numPeople = solution.getInputToInt("How many people? ");
        int numPizzas = solution.getInputToInt("How many pizzas do you have? ");
        int slicesPerPizza = solution.getInputToInt("How many slices per pizza? ");

        PizzaParty party = new PizzaParty(numPizzas, slicesPerPizza, numPeople);

        party.displayOutput();
    }

    private int getInputToInt(String prompt) {
        System.out.print(prompt);

        String userInput = input.nextLine();

        return Integer.parseInt(userInput);
    }
}
