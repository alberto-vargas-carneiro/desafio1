package com.alberto.desafio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alberto.desafio.entities.Order;
import com.alberto.desafio.services.OrderService;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034, 150.00, 20.00);
		System.out.printf("Pedido código " + order.getCode() + "%nValor total: R$ " + orderService.total(order));
		Order order2 = new Order(2282, 800.0, 10.0);
		System.out.printf("%nPedido código " + order2.getCode() + "%nValor total: R$ " + orderService.total(order2));
		Order order3 = new Order(1309, 95.9, 0.0);
		System.out.printf("%nPedido código " + order3.getCode() + "%nValor total: R$ " + orderService.total(order3));
	}

}
