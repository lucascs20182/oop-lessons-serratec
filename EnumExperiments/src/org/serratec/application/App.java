package org.serratec.application;

import java.time.LocalDate;

import org.serratec.classes.Pedido;
import org.serratec.enums.Bebidas;
import org.serratec.enums.Sanduiches;

public class App {

	public static void main(String[] args) {
		Sanduiches sanduiche = Sanduiches.ATUM;
		Bebidas bebida = Bebidas.AGUA_MINERAL;
		Pedido pedido1 = new Pedido(bebida, sanduiche, LocalDate.now());
		
		System.out.println(Pedido.imprimirCardapio());
		System.out.println(pedido1);
		System.out.println("Valor do pedido: R$ " + pedido1.calcularPedido());
	}
}
