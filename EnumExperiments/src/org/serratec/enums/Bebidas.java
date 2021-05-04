package org.serratec.enums;

public enum Bebidas {
	COCA_COLA(7.90), 
	AGUA_MINERAL(4.12),
	SUCO_LARANJA(5);
	
	private final double preco;

	private Bebidas(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}
}
