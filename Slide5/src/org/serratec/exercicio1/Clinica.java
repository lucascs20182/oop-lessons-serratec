package org.serratec.exercicio1;

public class Clinica extends Plano {
	private String nome;
	private String cgc;
	
	public Clinica(String empresa, String nome, String cgc) {
		super(empresa);
		this.nome = nome;
		this.cgc = cgc;
	}

	@Override
	public String toString() {
		return super.toString() + "\nClinica: " + nome;
	}

	public String getNome() {
		return nome;
	}

	public String getCgc() {
		return cgc;
	}
}
