package org.serratec.exercicio2.composicao;

public class TesteClasses {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("384.343.348-90", "Joaquim", "2345-9889");
		Imovel imovel1 = new Imovel("Quitandinha", "apto", 98000, pessoa1);
		
		System.out.println(imovel1.getTipo() + "," + imovel1.getDono().getNome()
				+ "," + imovel1.getValor());
	}
}
