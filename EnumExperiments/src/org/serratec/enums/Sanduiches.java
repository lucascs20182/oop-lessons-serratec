package org.serratec.enums;

public enum Sanduiches {
	ATUM(7.90), 
	VEGETARIANO(4.12),
	MISTO_QUENTE(5);
	
	private final double preco;

	private Sanduiches(double preco) {
		// podia ter colocado um atributo nome
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}
}
