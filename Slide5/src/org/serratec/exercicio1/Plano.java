package org.serratec.exercicio1;

public class Plano {
	protected String empresa;
	protected double valorPago = 80;
	protected double valorIss = 5;
	
	public Plano(String empresa) {
		this.empresa = empresa;
	}
	
	@Override
	public String toString() {
		return "Plano: " + empresa + "\nValor pago: " + String.format("%.2f", valorPago);
	}

	public double calcularPagamento() {
		return valorPago = valorPago - valorPago * valorIss / 100;
	}

	public double getValorPago() {
		return valorPago;
	}
}
