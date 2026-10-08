package org.example.source;

import org.example.model.CementOrder;
import org.example.model.Order;

import java.time.LocalDateTime;

public class HashOrderSourceAdapter extends AbstractOrderSourceAdapter {
    protected HashOrderSourceAdapter(RawDataSource rawDataSource) {
        super(rawDataSource);
    }

    @Override
    protected Order parseLine(String line) {
        String[] parts = line.split("#");
        return new CementOrder(
                LocalDateTime.parse(parts[0]),
                parts[1],
                Long.parseLong(parts[2])
        );
    }
}
