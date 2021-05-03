package org.serratec.imovel;

public class Teste {

	public static void main(String[] args) {
		Apto apto1 = new Apto("R. Tal e Tal, nº 17 - Barra", 150000, 17);
		Casa casa1 = new Casa("R. Turur, nº 14 - Alto", 250000, true);
		
		Proprietario proprietario1 = new Proprietario("Lucas Cruz", apto1);
		Proprietario proprietario2 = new Proprietario("Lucas Cruz", casa1);
		
		System.out.println(proprietario1.getNome() + "\n" + proprietario1.getImovel() + "\n");
		System.out.println(proprietario2.getNome() + "\n"  + proprietario2.getImovel());
	}
}
