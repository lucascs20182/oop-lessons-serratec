package org.serratec.exercicio;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Pedido {
	private int numero;
	private LocalDate dataPedido;
	private double quantidade;
	private double valor;
	private double totalPedido;
	
	public Pedido(int numero, LocalDate dataPedido, double quantidade, double valor) {
		this.numero = numero;
		this.dataPedido = dataPedido;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public int getNumero() {
		return numero;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public double getValor() {
		return valor;
	}

	public double getTotal() {
		return totalPedido;
	}
	
	public void finalizarPedido() {
		if(this.dataPedido.getDayOfWeek() == DayOfWeek.SUNDAY) {
			this.valor -= this.valor * 10/100;
		}
		
		this.totalPedido = this.quantidade * this.valor;
	}


	@Override
	public String toString() {
		return "Pedido [numero=" + numero + ", dataPedido=" + dataPedido + ", quantidade=" + quantidade + ", valor="
				+ valor + ", totalPedido=" + totalPedido + "]";
	}	
}
