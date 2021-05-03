package org.serratec.imovel;

public class Proprietario {
	private String nome;
	private Imovel imovel;
	
	public Proprietario(String nome, Imovel imovel) {
		this.nome = nome;
		this.imovel = imovel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}
}
