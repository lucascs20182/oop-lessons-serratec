package org.serratec.exercicio2.composicao;

public class Imovel {
	private String local;
	private String tipo;
	private double valor;
	private Pessoa dono;
	
	public Imovel(String local, String tipo, double valor, Pessoa dono) {
		super();
		this.local = local;
		this.tipo = tipo;
		this.valor = valor;
		this.dono = dono;
	}

	public String getTipo() {
		return tipo;
	}

	public double getValor() {
		return valor;
	}

	public Pessoa getDono() {
		return dono;
	}		
}
