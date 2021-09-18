package base;

public class Month {

    private static final String JANUARY = "January";
    private static final String FEBRUARY = "February";
    private static final String MARCH = "March";
    private static final String APRIL = "April";
    private static final String MAY = "May";
    private static final String JUNE = "June";
    private static final String JULY = "July";
    private static final String AUGUST = "August";
    private static final String SEPTEMBER = "September";
    private static final String OCTOBER = "October";
    private static final String NOVEMBER = "November";
    private static final String DECEMBER = "December";

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
