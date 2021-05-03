package org.serratec.livraria;

public class Programa {
	public static void main(String[] args) {
		TipoOperacao emprestimo = TipoOperacao.EMPRESTIMO;
		TipoOperacao venda = TipoOperacao.VENDA;
		
		Livro livro1 = new Livro("Ariano Suassuna", "O Auto da Compadecida", 26.80);
		Livraria operacao1 = new Operacao(emprestimo, livro1);
		Livraria operacao2 = new Operacao(venda, livro1);
		
		operacao1.emprestarLivro();
		System.out.println(operacao1 + "\n");
		
		operacao2.venderLivro();
		System.out.println(operacao2);
	}
}
