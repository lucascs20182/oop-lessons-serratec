package org.serratec.exercicio2.associacao;

public class Endereco {
	private String rua;
	private String bairro;
	private String cidade;
	public Endereco(String rua, String bairro, String cidade) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
	}
	public String getRua() {
		return rua;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCidade() {
		return cidade;
	}
	
	@Override
	public String toString() {
		return "R. " + rua + ", " + bairro + " - " + cidade;
	}
}
