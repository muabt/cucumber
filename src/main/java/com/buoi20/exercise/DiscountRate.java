package com.buoi20.exercise;

import java.util.Locale;

public class DiscountRate {
    public static final double serviceDiscountPremium = 0.2;
    public static final double serviceDiscountGold = 0.15;
    public static final double serviceDiscountSilver = 0.1;
    public static final double productDiscountPremium = 0.1;
    public static final double productDiscountGold = 0.1;
    public static final double productDiscountSilver = 0.1;

    public static double getServiceDiscountRate(String type) {
        if (type == null){
            return 0;
        }
        switch (type.toUpperCase(Locale.ROOT)) {
            case "PREMIUM":
                return serviceDiscountPremium;
            case "GOLD":
                return serviceDiscountGold;
            case "SILVER":
                return serviceDiscountSilver;
            default:
                return 0;
        }
    }

    public static double getProductDiscountRate(String type) {
        if (type == null){
            return 0;
        }

        switch (type.toUpperCase(Locale.ROOT)) {
            case "PREMIUM":
                return productDiscountPremium;
            case "GOLD":
                return productDiscountGold;
            case "SILVER":
                return productDiscountSilver;
            default:
                return 0;
        }
    }
}
