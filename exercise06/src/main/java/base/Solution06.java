/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 William Furie
 */

package base;

import java.time.Year;
import java.util.Scanner;

public class Solution06 {
    /*
        // Wrap the prompting and str -> int conversion in a method
        print "What is your current age?"
        `currentAgeStr` = read string from user
        print "At what age would you like to retire?"
        `retireAgeStr` = read string from user

        'currentAge' = convert currentAgeStr to int
        'retireAge' = convert retireAgeStr to int
        `yearsToGo` = `retireAge` - `currentAge`
        `currentYear` = get the current year
        `retirementYear` = `currentYear` + `yearsToGo`

        print "You have `yearsToGo` years left until you can retire."
        print "It's `currentYear`, so you can retire in `retirementYear`."
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int currentAge = getInputToInt(input, "What is your current age? ");
        int retireAge = getInputToInt(input, "At what age would you like to retire? ");
        int yearsToGo = retireAge - currentAge;
        int currentYear = Year.now().getValue();
        int retirementYear = currentYear + yearsToGo;

        System.out.printf("You have %d years left until you can retire.\n", yearsToGo);
        System.out.printf("It's %d, so you can retire in %d.", currentYear, retirementYear);
    }

    private static int getInputToInt(Scanner input, String prompt) {
        System.out.print(prompt);

        String userInput = input.nextLine();

        return Integer.parseInt(userInput);
    }
}
