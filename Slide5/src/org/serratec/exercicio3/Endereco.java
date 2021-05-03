package org.serratec.exercicio3;

public class Endereco {
	private String rua;
	private String bairro;
	private String cep;
	private Contato cidade;
	
	public Endereco(String rua, String bairro, String cep, Contato cidade) {
		this.rua = rua;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
	}

	public String getRua() {
		return rua;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCep() {
		return cep;
	}

	public Contato getCidade() {
		return cidade;
	}
}
