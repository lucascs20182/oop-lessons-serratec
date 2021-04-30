package org.serratec.classes;

public class ImpostoDeRenda {
	protected String nome, telefone, email;
	protected double rendimentos;
	
	public ImpostoDeRenda(String nome, double rendimentos) {
		this.nome = nome;
		this.rendimentos = rendimentos;
	}
	
	public double calculeIR() { return this.rendimentos; }
}
