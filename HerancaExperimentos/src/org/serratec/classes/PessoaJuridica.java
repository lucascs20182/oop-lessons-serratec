package org.serratec.classes;

public class PessoaJuridica extends ImpostoDeRenda {
	private String cnpj, inscEstadual;

	public PessoaJuridica(String nome, double rendimentos, String cnpj, String inscEstadual) {
		super(nome, rendimentos);
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
	}

	@Override
	public double calculeIR() {
		return this.rendimentos * 15/100;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", inscEstadual=" + inscEstadual + ", nome=" + nome + ", rendimentos="
				+ rendimentos + "]";
	}
}
