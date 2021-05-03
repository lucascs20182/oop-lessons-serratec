package org.serratec.exercicio2.agregacao;

public class Time {
	private String nomeTime;
	private String tecnico;
	private Atleta[] atletas;
	
	public Time(String nomeTime, String tecnico, Atleta[] atletas) {
		super();
		this.nomeTime = nomeTime;
		this.tecnico = tecnico;
		this.atletas = atletas;
	}

	public String getNomeTime() {
		return nomeTime;
	}

	public String getTecnico() {
		return tecnico;
	}

	public Atleta[] getAtletas() {
		return atletas;
	}
	
	public void setAtletas(Atleta[] atletas) {
		this.atletas = atletas;
	}
	
	public void adicionarAtletas(Atleta atleta) {
		for(int i = 0; i < atletas.length; i++) {
			if(atletas[i] == null) {
				atletas[i] = atleta;
				return;
			}
		}
	}
	
	public void mostrarTime() {
		for(int i = 0; i < atletas.length; i++) {
			System.out.println(atletas[i].getNome());
		}
	}
}
