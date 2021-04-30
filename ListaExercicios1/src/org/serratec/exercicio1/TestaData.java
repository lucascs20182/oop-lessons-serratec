package org.serratec.exercicio1;

import java.time.LocalDate;

public class TestaData {

	public static void main(String[] args) {
		ConfigData data1 = new ConfigData();
		ConfigData data2 = new ConfigData(14, 05, 2021);
		
		data1.avancaProximoDia();
		System.out.println("Amanhã: " + data1);
		
		data1.setData(LocalDate.of(2021, 7, 05));

		System.out.println("Dia da data 1: " + data1.getDia());
		System.out.println("Mês da data 1: " + data1.getMes());
		System.out.println("Ano da data 1: " + data1.getAno());
		
		System.out.println(data1 + "\n" + data2);
		
		data1.setAno(2022);
		data1.setMes(01);
		data1.setDia(17);
		
		System.out.println("\n" + data1);
	}

}
