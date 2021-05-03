package org.serratec.exercicio1;

public class Medico extends Plano {
	protected String nome;
	protected int crm;
	
	public Medico(String empresa, String nome, int crm) {
		super(empresa);
		this.nome = nome;
		this.crm = crm;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nMédico: " + nome;
	}

	public String getNome() {
		return nome;
	}

	public int getCrm() {
		return crm;
	}

	@Override
	public double calcularPagamento() {
		return valorPago = super.calcularPagamento() + super.valorPago * 10/100;
	}	
}
