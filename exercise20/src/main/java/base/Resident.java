package base;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Resident {

    private static final String WISCONSIN = "Wisconsin";
    private static final String ILLINOIS = "Illinois";
    private static final String EAU_CLAIRE = "Eau Claire";
    private static final String DUNN = "Dunn";


    private static final double RATE_WISCONSIN = .05;
    private static final double RATE_ADD_EAU_CLAIRE = .005;
    private static final double RATE_ADD_DUNN = .004;
    private static final double RATE_ILLINOIS = .08;

    private double taxRate = 0;

    public Resident(String state, String county) {
        if (state.equals(WISCONSIN)) {
            taxRate += RATE_WISCONSIN;

            if (county.equals(DUNN)){
                taxRate += RATE_ADD_DUNN;
            } else if (county.equals(EAU_CLAIRE)) {
                taxRate += RATE_ADD_EAU_CLAIRE;
            }
        } else if (state.equals(ILLINOIS)) {
            taxRate += RATE_ILLINOIS;
        }
    }

    public double getTaxAmount(double orderAmount) {
        return roundUpPenny(taxRate * orderAmount);
    }

    public double getTotal(double orderAmount) {
        return roundUpPenny(orderAmount + getTaxAmount(orderAmount));
    }

    private double roundUpPenny(double worth) {
        // Use BigDecimal to avoid any precision errors
        BigDecimal total = BigDecimal.valueOf(worth);
        BigDecimal comp = BigDecimal.valueOf(0.01);
        BigDecimal multiplier = BigDecimal.valueOf(100);

        total.multiply(multiplier);
        total.setScale(0, RoundingMode.CEILING);
        total.multiply(comp);

        return total.doubleValue();
    }
}
