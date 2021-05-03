package org.serratec.exercicio2.composicao;

public class Pessoa {
	private String cpf;
	private String nome;
	private String telefone;
	
	public Pessoa(String cpf, String nome, String telefone) {
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}
}
