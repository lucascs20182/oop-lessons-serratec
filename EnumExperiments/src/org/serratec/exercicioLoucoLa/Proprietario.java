package org.serratec.exercicioLoucoLa;

public class Proprietario {
	private String nome;

	public Proprietario(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Proprietario [nome=" + nome + "]";
	}

	public String getNome() {
		return nome;
	}
}
