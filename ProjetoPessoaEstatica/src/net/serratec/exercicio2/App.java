package net.serratec.exercicio2;

public class App {

	public static void main(String[] args) {		
		Pessoa pessoa1 = new Pessoa("Caio", 80, 1.76);
		Pessoa pessoa2 = new Pessoa("Jordan", 65, 1.68);
		Pessoa pessoa3 = new Pessoa("Ellie", 46, 1.59);
	
		System.out.println("Pessoa com maior peso: " + Pessoa.getNomePessoaComMaiorPeso());
		System.out.println("Pessoa com maior altura: " + Pessoa.getNomePessoaComMaiorAltura());
		System.out.println("Média do peso: " + Pessoa.calculaMediaPeso());
		System.out.println("Média da altura: " + Pessoa.calculaMediaAltura());
	}

}
