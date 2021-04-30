package org.serratec.exercicio1;

import java.time.LocalDate;

public class ConfigData {
	private int dia, mes, ano;
	LocalDate data;
	
	public ConfigData() {
		data = LocalDate.now();
		
		this.dia = data.getDayOfMonth();
		this.mes = data.getMonthValue();
		this.ano = data.getYear();
	}

	public ConfigData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		data = LocalDate.of(ano, mes, dia);
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.data = LocalDate.of(this.ano, this.mes, dia);
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.data = LocalDate.of(this.ano, mes, this.dia);
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.data = LocalDate.of(ano, this.mes, this.dia);
		this.ano = ano;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = LocalDate.of(data.getYear(), data.getMonth(),
				data.getDayOfMonth());
		
		this.dia = this.data.getDayOfMonth();
		this.mes = this.data.getMonthValue();
		this.ano = this.data.getYear();
	}

	@Override
	public String toString() {
		return "Data: " + data.getDayOfMonth() + "/"
				+ data.getMonthValue() + "/" + data.getYear();
	}
	
	public void avancaProximoDia() {
		this.data = data.plusDays(1);
		
		this.dia = data.getDayOfMonth();
		this.mes = data.getMonthValue();
		this.ano = data.getYear();
	}
}
