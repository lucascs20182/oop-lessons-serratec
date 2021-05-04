package org.serratec.exercicioLoucoLa;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina {
	protected String modelo;
	protected static double valorCobrado;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;
	
	public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
		super();
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}
	
	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", valorCobrado=" + valorCobrado + ", dataConserto=" + dataConserto + "]";
	}
	
	public static double getValorCobrado() {
		return valorCobrado;
	}

	@Override
	public double lavarVeiculo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double trocarOleo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double revisao() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getModelo() {
		return modelo;
	}
}
