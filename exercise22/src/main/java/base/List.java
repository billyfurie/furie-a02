package base;

import java.util.ArrayList;

public class List {

    private ArrayList list;
    private double max = 0;

    public List() {
        list = new ArrayList();
    }

    public void addNumber(double number) {
        if (list.contains(number)) {
            System.exit(0);
        }

        max = Math.max(max, number);
        list.add(number);
    }

    public double getMax() {
        return max;
    }
}
