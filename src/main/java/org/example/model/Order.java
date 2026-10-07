package org.example.model;

import java.time.LocalDateTime;

public interface Order {
    LocalDateTime getOrderTime();
    String getCompanyName();
    long getWeightKg();
}
