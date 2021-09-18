package base;

import java.util.Scanner;

public class Solution22 {

    /*
        class List()
            double max

            ArrayList numbers

            add(double number)
                if numbers.contains(number)
                    exit program
                if number > max
                    max = number

                numbers.add(number)

            getMax()
                return max
     */

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution22 solution = new Solution22();

        double num1 = solution.getNumberFromInput("Enter the first number: ");
        double num2 = solution.getNumberFromInput("Enter the second number: ");
        double num3 = solution.getNumberFromInput("Enter the third number: ");

        List numbers = new List();
        numbers.addNumber(num1);
        numbers.addNumber(num2);
        numbers.addNumber(num3);

        solution.displayMax(numbers.getMax());
    }

    private double getNumberFromInput(String prompt) {
        System.out.print(prompt);

        String num = input.nextLine();

        return Double.parseDouble(num);
    }

    private void displayMax(double max) {
        System.out.printf("The largest number is %.2f%n", max);
    }
}
