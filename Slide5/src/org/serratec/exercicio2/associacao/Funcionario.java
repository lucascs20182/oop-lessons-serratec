package org.serratec.exercicio2.associacao;

public class Funcionario {
	private String nome; 
	private String cpf; // poderia ser int, mas n�o ser� manipulado
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
		return "Nome do funcion�rio: " + nome + "\nCPF: " + cpf 
				+ "\nEndere�o: " + endereco;
	}
}
