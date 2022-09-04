package com.kodilla.exception.homework;


public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("123456"));
        warehouse.addOrder(new Order("123456"));
        warehouse.addOrder(new Order("12345"));

        String number = "123456";
        try {
            System.out.println("Order found, " + warehouse.getOrder(number));
        } catch (OrderDoesNotExistException e) {
            System.out.println("Sorry, we can't find this order");
        } finally {
            System.out.println("Feel free to look for another order");
        }
    }
}
