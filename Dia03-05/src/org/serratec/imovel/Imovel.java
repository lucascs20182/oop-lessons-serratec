package org.serratec.imovel;

public class Imovel {
	protected String local;
	private double valorImovel;
	
	public Imovel(String local, double valorImovel) {
		this.local = local;
		this.valorImovel = valorImovel;
	}

	@Override
	public String toString() {
		return "Imovel: " + local + "\nvalor do imovel: "
				+ String.format("R$ %.2f", valorImovel) + "\nValor a pagar de ITBI: "
				+ String.format("R$ %.2f", this.calculaImpostoVenda());
	}
	
	public double calculaImpostoVenda() {
		final double VALOR_ITBI = 0.035;
		
		return valorImovel * VALOR_ITBI;
	}
}
