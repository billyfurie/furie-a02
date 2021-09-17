package base;

public class Month {

    private static String JANUARY = "January";
    private static String FEBRUARY = "February";
    private static String MARCH = "March";
    private static String APRIL = "April";
    private static String MAY = "May";
    private static String JUNE = "June";
    private static String JULY = "July";
    private static String AUGUST = "August";
    private static String SEPTEMBER = "September";
    private static String OCTOBER = "October";
    private static String NOVEMBER = "November";
    private static String DECEMBER = "December";

    int number;
    String name;

    public Month(int number) {
        this.number = number;

        setName(number);
    }

    public void setName(int number) {
        switch(number) {
            case 1:
                name = JANUARY;
                break;
            case 2:
                name = FEBRUARY;
                break;
            case 3:
                name = MARCH;
                break;
            case 4:
                name = APRIL;
                break;
            case 5:
                name = MAY;
                break;
            case 6:
                name = JUNE;
                break;
            case 7:
                name = JULY;
                break;
            case 8:
                name = AUGUST;
                break;
            case 9:
                name = SEPTEMBER;
                break;
            case 10:
                name = OCTOBER;
                break;
            case 11:
                name = NOVEMBER;
                break;
            case 12:
                name = DECEMBER;
                break;
        }
    }

    public String getName() {
        return name;
    }
}
