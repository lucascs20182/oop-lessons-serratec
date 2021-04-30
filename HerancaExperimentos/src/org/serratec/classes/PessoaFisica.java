package org.serratec.classes;

public class PessoaFisica extends ImpostoDeRenda {
	private String cpf, rg;

	public PessoaFisica(String nome, double rendimentos, String cpf, String rg) {
		super(nome, rendimentos);
		this.cpf = cpf;
		this.rg = rg;
	}

	@Override
	public double calculeIR() {
//		super.calculeIR();
		return this.rendimentos * 12/100;
	}

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", rg=" + rg + ", nome=" + nome + ", rendimentos=" + rendimentos + "]";
	}
}
