package org.serratec.exercicio2.associacao;

public class Program {

	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Doutor Oliveira", 
				"Barra do Imbuí", "Teresópolis");
		
		// relação de associação		
		Funcionario funcionario1 = new Funcionario(
				"Lucas Cruz", "123.456.789-10", endereco1);
		
		System.out.println(funcionario1);
	}

}
