package org.serratec.exercicioLoucoLa;

import java.time.LocalDate;

public class TesteOficina {

	public static void main(String[] args) {
		Proprietario proprietario = new Proprietario("Lucas");
		Carro carro = new Carro("Shelby Mustang GT 500", LocalDate.of(2021, 5, 1), proprietario, "esportivo");
		
		carro.trocarOleo();
		carro.revisao();
		
		System.out.println("\nProprietario: " + proprietario.getNome() + "\nCarro: " + carro.getModelo()
				+ "\nCategoria: " + carro.getCategoria() + "\nValor cobrado pelo serviço: "
				+ Veiculo.valorCobrado);
	}
}
