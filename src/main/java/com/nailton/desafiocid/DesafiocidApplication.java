package com.nailton.desafiocid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.nailton.entities.Order;
import com.nailton.services.OrderService;

@SpringBootApplication
@ComponentScan({"com.nailton"})
public class DesafiocidApplication implements CommandLineRunner {
	
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafiocidApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Order order1 = new Order("1034", 150.00, 20.0);
		System.out.println("Pedido código " + order1.getCode() + "\n" + "Valor total: " + orderService.total(order1));
		
		Order order2 = new Order("2282", 800.00, 10.0);
		System.out.println("Pedido código " + order2.getCode() + "\n" + "Valor total: " + orderService.total(order2));
		
		Order order3 = new Order("1309", 95.90, 0.0);
		System.out.println("Pedido código " + order3.getCode() + "\n" + "Valor total: " + String.format("%.2f", orderService.total(order3)));
	}

}
