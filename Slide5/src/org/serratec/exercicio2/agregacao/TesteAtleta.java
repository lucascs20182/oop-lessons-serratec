package org.serratec.exercicio2.agregacao;

public class TesteAtleta {

	public static void main(String[] args) {
		Atleta atleta1 = new Atleta("Diego Alves", 25, "Goleiro");
		Atleta atleta2 = new Atleta("Rafinha", 32, "Lateral");
		Atleta atleta3 = new Atleta("Arrascaeta", 25, "Meio campo");

		Time time = new Time("Flamengo", "Jorge Jesus", new Atleta[3]);
		time.adicionarAtletas(atleta1);
		time.adicionarAtletas(atleta2);
		time.adicionarAtletas(atleta3);
		
		System.out.println("Time: " + time.getNomeTime());
		time.mostrarTime();
	}

}
