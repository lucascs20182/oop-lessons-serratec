package org.serratec.exercicio1;

public class ControlePagamento {
	private double totalPago;

	public double getTotalPago() {
		return totalPago;
	}
	
	public void calcularTotalPago(Plano plano) {
		this.totalPago += plano.getValorPago();
	}
}
