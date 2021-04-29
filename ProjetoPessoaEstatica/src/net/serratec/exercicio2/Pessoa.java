package net.serratec.exercicio2;

public class Pessoa {
	private String nome;
	private double peso;
	private double altura;
	
	private static int totalPessoas;	
	private static double maiorPeso = 0;
	private static String nomePessoaComMaiorPeso = "";
	private static double maiorAltura = 0;
	private static String nomePessoaComMaiorAltura = "";	
	private static double mediaPeso = 0;
	private static double mediaAltura = 0;
	
	public Pessoa(String nome, double peso, double altura) {
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		Pessoa.totalPessoas++;
		
		if(this.peso > maiorPeso) {
			Pessoa.maiorPeso = this.peso;
			Pessoa.nomePessoaComMaiorPeso = this.nome;
		}
		
		if(this.altura > maiorAltura) {
			Pessoa.maiorAltura = this.altura;
			Pessoa.nomePessoaComMaiorAltura = this.nome;
		}
		
		Pessoa.mediaPeso += this.peso;
		Pessoa.mediaAltura += this.altura;
	}

	public String getNome() {
		return this.nome;
	}

	public double getPeso() {
		return this.peso;
	}

	public double getAltura() {
		return this.altura;
	}
	
	
	
	public static String getNomePessoaComMaiorPeso() {
		return nomePessoaComMaiorPeso;
	}


	public static String getNomePessoaComMaiorAltura() {
		return nomePessoaComMaiorAltura;
	}


	public static int getTotalPessoas() {
		return Pessoa.totalPessoas;
	}
	
	public static double calculaMediaPeso() {
		return Pessoa.mediaPeso / Pessoa.getTotalPessoas(); 
	}
	
	public static double calculaMediaAltura() {
		return Pessoa.mediaAltura / Pessoa.getTotalPessoas(); 
	}
}
