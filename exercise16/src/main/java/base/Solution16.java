/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 William Furie
 */

package base;

import java.util.Scanner;

public class Solution16 {

    /*
        checkLegal(age)
            if age >= 16
                return true
            else
                return false

        displayLegality(legal)
            message = legal ? "You are old enough to legally drive." : "You are not old enough to legally drive."

        getUserAge(scanner)
            print "What is your age? "
            string = get input from scanner
            convert string to int
    */

    private static final int LEGAL_AGE = 16;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age = getUserAge(input);

        boolean legal = checkLegal(age);

        displayLegality(legal);
    }

    private static boolean checkLegal(int age) {
        return age >= LEGAL_AGE;
    }

    private static int getUserAge(Scanner input) {
        System.out.print("What is your age? ");

        String ageStr = input.nextLine();

        return Integer.parseInt(ageStr);
    }

    private static void displayLegality(boolean legal) {
        String message = legal ? "You are old enough to legally drive." : "You are not old enough to legally drive.";

        System.out.println(message);
    }
}
