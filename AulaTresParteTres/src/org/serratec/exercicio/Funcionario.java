package org.serratec.exercicio;

public class Funcionario {
	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public double calcularInss() {
		return this.salario * 0.11;
	}
	
	public double calcularValeTransporte() {
		return this.salario * 0.06;
	}
	
	public double calcularSalarioLiquido() {
		return this.salario - (this.salario * 0.06) - (this.salario * 0.11);
	}

	public String getNome() {
		return this.nome;
	}

	public double getSalario() {
		return this.salario;
	}
}
