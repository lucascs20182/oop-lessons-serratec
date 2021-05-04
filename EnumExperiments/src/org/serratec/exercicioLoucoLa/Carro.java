package org.serratec.exercicioLoucoLa;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Carro extends Veiculo {
	private String categoria;
	
	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario,
			String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return this.categoria;
	}

	@Override
	public double lavarVeiculo() {
		double valorCobrado = TipoServico.LAVAGEM.getValorPorServico();
		System.out.println("Pre�o da lavagem: " + valorCobrado);
		
		return super.valorCobrado += valorCobrado;
	}

	@Override
	public double trocarOleo() {
		double valorCobrado = TipoServico.OLEO.getValorPorServico();
		
		if(this.dataConserto.getDayOfWeek() == DayOfWeek.SATURDAY) {
			valorCobrado -= valorCobrado * 50/100;
		}
		
		System.out.println("Pre�o da troca de �leo: " + valorCobrado);
		
		return super.valorCobrado += valorCobrado;
	}

	@Override
	public double revisao() {
		double valorCobrado = TipoServico.REVISAO.getValorPorServico();
		
		if(this.dataConserto.getMonthValue() == 8) {
			valorCobrado -= valorCobrado * 10/100;
		}
		
		System.out.println("Pre�o da revis�o: " + valorCobrado);
		
		return super.valorCobrado += valorCobrado;
	}
}
