package org.serratec.imovel;

public class Apto extends Imovel {
	private int andar;

	public Apto(String local, double valorImovel, int andar) {
		super(local, valorImovel);
		this.andar = andar;
	}

	public int getAndar() {
		return andar;
	}
}
