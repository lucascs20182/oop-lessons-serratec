package org.serratec.classes;

import java.time.LocalDate;

import org.serratec.enums.Bebidas;
import org.serratec.enums.Sanduiches;

public class Pedido {
	private Bebidas bebida;
	private Sanduiches sanduiche;
	private LocalDate dataPedido;
	
	public Pedido(Bebidas bebida, Sanduiches sanduiche, LocalDate dataPedido) {
		super();
		this.bebida = bebida;
		this.sanduiche = sanduiche;
		this.dataPedido = dataPedido;
	}
	

	@Override
	public String toString() {
		return "Pedido [bebida=" + bebida + ", sanduiche=" + sanduiche + ", dataPedido=" + dataPedido + "]";
	}

	public static String imprimirCardapio() {
		String resultado = "Sanduíches\n"; 
		for(Sanduiches sanduiche : Sanduiches.values()) {
			resultado += sanduiche.name().toLowerCase() + ": R$ "
					+ sanduiche.getPreco() + "\n";
		}
		
		resultado += "\nBebidas\n";
		
		for(Bebidas bebida : Bebidas.values()) {
			resultado += bebida.name().toLowerCase() + ": R$ "
					+ bebida.getPreco() + "\n";
		}
		
		return resultado;
	}
	
	public double calcularPedido() {
		return sanduiche.getPreco() + bebida.getPreco();
	}
}
