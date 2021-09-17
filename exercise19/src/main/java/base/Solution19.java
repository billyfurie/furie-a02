package base;

import java.util.Scanner;

public class Solution19 {

    /*
    create Person object
    Person(height, weight)
        BMI_CONSTANT = 703

        getBMI()
            return (weight / (height * height)) * BMI_CONSTANT

    getDoubleFromUser(prompt)
        print(prompt)
        numStr = get string from user

        while !isNumeric(numStr)
            print(error)
            print(prompt)

        return (double)numStr

    isNumeric(string)
        if string is null or string is ""
            return false

        try
            parseDouble(string)
            return true
        catch numberException
            return false
     */

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution19 solution = new Solution19();

        double height = solution.getDoubleFromUser("Enter your height in inches. ");
        double weight = solution.getDoubleFromUser("Enter your weight in pounds. ");

        Person friend = new Person(height, weight);

        solution.displayBMI(friend);
    }

    private double getDoubleFromUser(String prompt) {
        System.out.print(prompt);

        String numString = input.nextLine();

        while (!isNumeric(numString)) {
            System.out.println("That is not a number...");
            System.out.print(prompt);

            numString = input.nextLine();
        }

        return Double.parseDouble(numString);
    }

    private boolean isNumeric(String string) {
        if (string == null || string.equals("")) {
            return false;
        }

        try {
            Double.parseDouble(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void displayBMI(Person person) {
        double BMI = person.getBMI();
        String weightMessage = person.getWeightMessage();

        System.out.printf("Your BMI is %.1f.%n", BMI);
        System.out.println(weightMessage);
    }
}
