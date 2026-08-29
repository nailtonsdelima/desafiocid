package com.nailton.services;

import org.springframework.stereotype.Service;

import com.nailton.entities.Order;

@Service
public class OrderService {
	
	private ShippingService shippingService;

    public OrderService() {
        shippingService = new ShippingService();
    }

    public double discount(double amount) {

        if (amount < 100.0) {
            return 0.0;
        }
        else if (amount <= 200.0) {
            return amount * 0.20;
        }
        else {
            return amount * 0.10;
        }
    }
    
    public double total(Order order) {

        double discount = discount(order.getBasic());
        double shipping = shippingService.shipment(order.getBasic());

        return order.getBasic() - discount + shipping;
    }

}
