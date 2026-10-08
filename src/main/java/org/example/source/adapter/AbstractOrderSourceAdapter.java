package org.example.source;

import org.example.model.Order;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractOrderSourceAdapter implements OrderSource {
    private final RawDataSource rawDataSource;

    protected AbstractOrderSourceAdapter(RawDataSource rawDataSource) {
        this.rawDataSource = rawDataSource;
    }

    @Override
    public List<Order> getOrders() {
        List<Order> orders = new ArrayList<>();
        List<String> lines = new ArrayList<>();


        for (String line : lines) {
            if (line == null || line.isBlank()) {
                continue;
            }
            orders.add(parseLine(line));
        }
        return orders;
    }


    protected abstract Order parseLine(String line);
}
