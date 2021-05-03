package org.serratec.exercicio1;

public class TestePlano {

	public static void main(String[] args) {
		Clinica clinica1 = new Clinica("Amil", "Checkup", "123.456.789/0001-56");
		Medico medico1 = new Medico("Golden Cross", "Carlos da Silva", 1345445);
		Anestesista anestesista1 = new Anestesista("Amil", "Carla dos Santos", 123456, "Peridural");
		ControlePagamento cp = new ControlePagamento();
		
		clinica1.calcularPagamento();
		medico1.calcularPagamento();
		anestesista1.calcularPagamento();
		
		cp.calcularTotalPago(clinica1);
		cp.calcularTotalPago(medico1);
		cp.calcularTotalPago(anestesista1);
		
		System.out.println(clinica1 + "\n");
		System.out.println(medico1 + "\n");
		System.out.println(anestesista1 + "\n");
		
		System.out.println("Total pago pelo plano: " + String.format("%.2f", cp.getTotalPago()));
	}

}
