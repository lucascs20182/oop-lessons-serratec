package org.serratec.exercicio3;

public class Contato {
	private String nome;
	private Telefone[] telefones;
	private Endereco endereco;
	
	public Contato(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public Telefone[] getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void mostrarTelefones() {
		
	}
}
