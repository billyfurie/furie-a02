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

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Solution15 solution = new Solution15();

        Password password = new Password("TotallySecret123");

        String username = solution.getStringFromInput("What is the username? ");
        String passwordString = solution.getStringFromInput("What is the password? ");

        String authResult = password.getAuthentication(passwordString);
        System.out.print(authResult);
    }

    private String getStringFromInput(String prompt) {
        System.out.print(prompt);

        return input.nextLine();
    }
}
