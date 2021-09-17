package base;

import java.util.Scanner;

public class Person {

    private static final double BMI_CONSTANT = 703;
    public static final String WEIGHT_MESSAGE_UNDER = "You are underweight. You should see your doctor.";
    public static final String WEIGHT_MESSAGE_OVER = "You are overweight. You should see your doctor.";
    public static final String WEIGHT_MESSAGE_NORMAL = "You are within the ideal weight range.";

    private double height;
    private double weight;
    private double BMI;
    private String weightMessage;

    Person(double height, double weight) {
        this.height = height;
        this.weight = weight;
        BMI = weight / (height * height) * 703;

        if (BMI < 18.5) {
            weightMessage = WEIGHT_MESSAGE_UNDER;
        } else if (BMI > 25) {
            weightMessage = WEIGHT_MESSAGE_OVER;
        } else {
            weightMessage = WEIGHT_MESSAGE_NORMAL;
        }
    }

    public double getBMI() {
        return BMI;
    }

    public String getWeightMessage(){
        return weightMessage;
    }
}
