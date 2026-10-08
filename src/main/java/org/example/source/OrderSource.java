package org.example.source.adapter;

import org.example.model.Order;

import java.util.List;

public interface OrderSource {
    List<Order> getOrders();
}
