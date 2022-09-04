package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Optional;

public class Warehouse {
    private  HashSet<Order> orderList = new HashSet<>();

    public void addOrder(Order order){
        orderList.add(order);
    }

    public Order getOrder(String orderNumber) throws OrderDoesNotExistException{
        Order returnedOrder = orderList
                .stream()
                .filter(order -> order.getNumber() == orderNumber)
                .findAny()
                .orElseThrow(() -> new OrderDoesNotExistException());
        return returnedOrder;
    }
}
