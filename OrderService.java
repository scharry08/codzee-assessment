package com.codzee.test;

import java.util.List;

public class OrderService {

    // Intentional flaw: N+1 database problem simulated in a loop
    public void processOrders(List<String> orderIds) {
        for (String orderId : orderIds) {
            String orderDetails = DatabaseMock.fetchOrderById(orderId);
            DatabaseMock.updateOrderStatus(orderId, "PROCESSED");
            System.out.println("Processed: " + orderDetails);
        }
    }
}
