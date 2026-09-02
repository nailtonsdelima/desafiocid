package com.nailton.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nailton.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
    
    public double total(Order order) {

        double discount = order.getBasic() * (order.getDiscount() / 100);
        double shipping = shippingService.shipment(order.getBasic());

        return order.getBasic() - discount + shipping;
    }

}
