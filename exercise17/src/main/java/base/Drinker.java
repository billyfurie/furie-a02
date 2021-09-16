package base;

public class Drinker {

    private static final int MALE = 1;
    private static final int FEMALE = 2;
    private static final double RATIO_MALE = 0.73;
    private static final double RATIO_FEMALE = 0.66;

    private int gender;
    private double weight;
    private double amountConsumed = 0;
    private double timeSince = 0;
    private double BAC = 0;
    private double ratio;

    public Drinker(int gender, double weight) {
        this.gender = gender;
        this.weight = weight;

        if (gender == MALE) {
            ratio = RATIO_MALE;
        } else {
            ratio = RATIO_FEMALE;
        }
    }

    public void drink(double amount, double timeSince) {
        amountConsumed += amount;
        this.timeSince = timeSince;
        setBAC();
    }

    private boolean canDrive() {
        return BAC < .08;
    }

    public void displayBreathalyzer() {
        System.out.printf("Your BAC is %.6f%n", BAC);

        if (canDrive()) {
            System.out.println("It is legal for you to drive.");
        } else {
            System.out.println("It is not legal for you to drive.");
        }
    }

    private void setBAC() {
        BAC = (amountConsumed * 5.14 / weight * ratio) - 0.15 * timeSince;
    }
}
