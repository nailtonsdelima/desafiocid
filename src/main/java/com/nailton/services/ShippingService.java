package com.nailton.services;

import org.springframework.stereotype.Service;

import com.nailton.entities.Order;

@Service
public class ShippingService {
	
		public double shipment(Order order) {
			
			double amount = order.getBasic();
			
			if (amount < 100.0) {
	            return 20.0;
	        }
	        else if (amount < 200.0) {
	            return 12.0;
	        }
	        else {
	            return 0.0;
	        }
		}

}
