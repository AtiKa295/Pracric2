package org.example.service;

import static org.example.config.ConfigDiscount.DISCOUNT_STEP;
import static org.example.config.ConfigDiscount.INITIAL_DISCOUNT;

public class StepDiscountPolicy implements DiscountPolicy{

    @Override
    public double calculateDiscount(int orderIndex) {
        double discount = INITIAL_DISCOUNT - (orderIndex * DISCOUNT_STEP);
        return Math.max(0.0, discount);

    }
}
