/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 William Furie
 */

package base;

import java.util.Scanner;

public class Solution15 {

    /*
        Password object
            - validate(attempt)
                if attempt == password
                    return true
                else
                    return false
            - getAuthentication(attempt)
                if validate(attempt)
                    return "Welcome!"
                else
                    return "I don't know you."

        Create prompt method that returns users string
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Password password = new Password("TotallySecret123");

        String username = getStringFromInput(input, "What is the username? ");
        String passwordString = getStringFromInput(input, "What is the password? ");

        String authResult = password.getAuthentication(passwordString);
        System.out.print(authResult);
    }

    private static String getStringFromInput(Scanner input, String prompt) {
        System.out.print(prompt);

        return input.nextLine();
    }
}
