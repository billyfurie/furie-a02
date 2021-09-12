package base;

public class Area {
    private static final double FT2TOM2 = 0.09290304;
    private double length;
    private double width;

    public Area(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getAreaMeters() {
        double feetSquared = length * width;
        return feetSquared * FT2TOM2;
    }

    public void displayOutput() {
        System.out.printf("You entered dimensions of %.3f feet by %.3f feet.%n", length, width);
        System.out.println("The area is");
        System.out.printf("%.3f square feet%n", getArea());
        System.out.printf("%.3f square meters%n", getAreaMeters());
    }
}
