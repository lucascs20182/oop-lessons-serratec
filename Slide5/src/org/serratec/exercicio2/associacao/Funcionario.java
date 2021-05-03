package org.serratec.exercicio2.associacao;

public class Funcionario {
	private String nome; 
	private String cpf; // poderia ser int, mas não será manipulado
	private Endereco endereco;
	
	public Funcionario(String nome, String cpf, Endereco endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}

	@Override
	public String toString() {
		return "Nome do funcionário: " + nome + "\nCPF: " + cpf 
				+ "\nEndereço: " + endereco;
	}
}
