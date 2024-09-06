package com.alberto.desafio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alberto.desafio.entities.Order;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;
    
    public double total(Order order) {
        return order.getBasic() - ((order.getDiscount() / 100) * order.getBasic()) + shippingService.shipment(order);
    }
}
