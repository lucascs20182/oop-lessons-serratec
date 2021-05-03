package org.serratec.livraria;

public class Operacao implements Livraria {
	private TipoOperacao tipo;
	private double valorOperacao;
	private Livro livro;
	
	public Operacao(TipoOperacao tipo, Livro livro) {
		super();
		this.tipo = tipo;
		this.livro = livro;
	}

	@Override
	public String toString() {
		return "Operacao: \ntipo: " + tipo + "\nvalorOperacao: " + valorOperacao + "\nlivro=" + livro;
	}
	
	public Livro getLivro() {
		return livro;
	}
	
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	public TipoOperacao getTipo() {
		return tipo;
	}

	public double getValorOperacao() {
		return valorOperacao;
	}

	@Override
	public void emprestarLivro() {
		this.valorOperacao = livro.getValor() * 2/100 + TAXAEMPRESTIMO;
		
	}

	@Override
	public void venderLivro() {
		this.valorOperacao = livro.getValor() + livro.getValor() * 9/100;
	}
}
