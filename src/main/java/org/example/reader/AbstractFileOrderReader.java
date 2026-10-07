package org.example.reader;

import org.example.model.Order;

import java.util.List;

public abstract class AbstractFileOrderReader implements OrderSource {
    @Override
    public List<Order> readOrders(String filePath) {
        return List.of();
    }





}
