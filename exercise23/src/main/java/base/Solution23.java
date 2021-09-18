/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 William Furie
 */

package base;

import java.util.Scanner;

public class Solution23 {

    /*
        create a series of checking methods for each dialogue

        beginChecks()
            starts off the chain of checks

        silentCheck()
            if silent
                advance to next yes option
            else
                advance to next no option

        repeat this framework for the rest of the checks
     */

    private static final Scanner input = new Scanner(System.in);

    private static final String YES = "y";
    private static final String NO = "n";

    public static void main(String[] args) {
        Solution23 solution = new Solution23();

        solution.beginChecks();
    }



    private boolean getUserResponse(String prompt) {
        System.out.print(prompt);

        String response = input.nextLine();

        return response.equals(YES);
    }

    private void beginChecks() {
        boolean silent = getUserResponse("Is the car silent when you turn the key? ");
        silentCheck(silent);
    }

    private void silentCheck(boolean silent) {
        if (silent) {
            boolean terminals = getUserResponse("Are the battery terminals corroded? ");
            terminalCheck(terminals);
        } else {
            boolean slicking = getUserResponse("Does the car make a slicking noise? ");
            slickingCheck(slicking);
        }
    }

    private void terminalCheck(boolean terminals) {
        if (terminals) {
            System.out.println("Clean terminals and try starting again.");
        } else {
            System.out.println("Replace cables and try again.");
        }
    }

    private void slickingCheck(boolean slicking) {
        if (slicking) {
            System.out.println("Replace the battery.");
        } else {
            boolean crankUp = getUserResponse("Does the car crank up but fail to start? ");
            crankUpCheck(crankUp);
        }
    }

    private void crankUpCheck(boolean crankUp) {
        if (crankUp) {
            System.out.println("Check spark plug connections.");
        } else {
            boolean engine = getUserResponse("Does the engine start and then die? ");
            engineCheck(engine);
        }
    }

    private void engineCheck(boolean engine) {
        if (engine) {
            boolean fuelInjection = getUserResponse("Does your car have fuel injection? ");
            fuelInjectionCheck(fuelInjection);
        } else {
            System.out.println("This should not be possible.");
        }
    }

    private void fuelInjectionCheck(boolean fuelInjection) {
        if (fuelInjection) {
            System.out.println("Get it in for service.");
        } else {
            System.out.println("Check to ensure the choke is opening and closing.");
        }
    }
}
