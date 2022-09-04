package com.kodilla.exception.homework;

import com.kodilla.exception.AirportRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    void testGetOrder() throws OrderDoesNotExistException {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("123-123"));
        warehouse.addOrder(new Order("123-123"));
        //when
        Order expected = new Order("123-123");
        Order result = warehouse.getOrder("123-123");
        //then
        assertEquals(result,expected);
    }

    @Test
    void testGetOrder_withException(){
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("123-123"));
        warehouse.addOrder(new Order("123-123"));
        //when
        //then
        assertThrows(OrderDoesNotExistException.class,() -> warehouse.getOrder("257-257"));
    }
}