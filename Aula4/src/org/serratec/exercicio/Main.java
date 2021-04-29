package org.serratec.exercicio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Pedido p1 = new Pedido(1, LocalDate.of(2021, 04, 29), 2, 5);
		Pedido p2 = new Pedido(2, LocalDate.of(2021, 04, 25), 10, 10);
		Pedido p3 = new Pedido(3, LocalDate.of(2021, 05, 02), 8, 7);
		
		p1.finalizarPedido();
		p2.finalizarPedido();
		p3.finalizarPedido();
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println("O valor do pedido 1 é: " + p1.getTotal());
		System.out.println("O valor do pedido 2 é: " + p2.getTotal());
		System.out.println("O valor do pedido 3 é: " + p3.getTotal());
	}

}
