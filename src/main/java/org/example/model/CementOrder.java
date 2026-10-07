package org.example.model;

import java.time.LocalDateTime;

public class CementOrder implements Order{

    private final LocalDateTime orderTime;
    private final String companyName;
    private final long weightKg;

    public CementOrder(LocalDateTime orderTime, String companyName, long weightKg) {
        this.orderTime = orderTime;
        this.companyName = companyName;
        this.weightKg = weightKg;
    }

    @Override
    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    @Override
    public String getCompanyName() {
        return companyName;
    }

    @Override
    public long getWeightKg() {
        return weightKg;
    }
}
