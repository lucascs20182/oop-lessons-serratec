package org.serratec.aulas;

public class Medico {
	private int crm;
	private String nome;
	private double salario;
	private double valorConsulta;
	private static int totalMedicos;
	
	public Medico() {
		Medico.totalMedicos++;
	}

	public Medico(int crm, String nome, double salario, double valorConsulta) {
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.valorConsulta = valorConsulta;
		Medico.totalMedicos++;
	}

	void pagamentoDinheiro() {
		this.salario += this.valorConsulta;
		System.out.println("Pagamento realizado.");
	}
	
	void pagamentoPlano() {
		this.salario += this.valorConsulta * 0.7;
		System.out.println("Pagamento realizado.");
	}
	
	String imprimeMedico() {
		return "crm: " + this.crm + "\nnome: " + this.nome
				+ "\nsalario: " + this.salario + "\nvalorConsulta: "
				+ this.valorConsulta;
	}

	public static int getTotalMedicos() {
		return Medico.totalMedicos;
	}		
}
