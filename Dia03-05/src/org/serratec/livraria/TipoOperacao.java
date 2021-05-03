package org.serratec.livraria;

public enum TipoOperacao {
	EMPRESTIMO(1), VENDA(2);

	private final int valor;

	TipoOperacao(int valorOpcao) {
		valor = valorOpcao;
	}

	public int getValor() {
		return valor;
	}
}
