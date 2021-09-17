/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 William Furie
 */

package base;

import java.util.Scanner;

public class Solution21 {

    /*
        Month(number)
            name = getName(number)

            setName(number)
                switch number
                    case 1:
                        return "January"
                    case 2:
                        return "February"
                    ...
            getName()
                return name
     */

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution21 solution = new Solution21();

        int number = solution.getMonthNumber();
        Month month = new Month(number);

        solution.displayMonthName(month);
    }

    private int getMonthNumber() {
        System.out.print("Please enter the number of the month: ");

        String num = input.nextLine();

        return Integer.parseInt(num);
    }

    private void displayMonthName(Month month) {
        System.out.printf("The name of the month is %s.", month.getName());
    }
}
