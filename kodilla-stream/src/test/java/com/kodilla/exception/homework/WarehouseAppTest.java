package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseAppTest {

    @Test
    public void testGetOrder(){
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("131/22/33"));
        warehouse.addOrder(new Order("132/22/33"));
        warehouse.addOrder(new Order("133/22/33"));
        warehouse.addOrder(new Order("134/22/33"));
        warehouse.addOrder(new Order("135/22/33"));
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("130/22/33"));

    }
}