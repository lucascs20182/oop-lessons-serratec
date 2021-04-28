package org.serratec.aulas;

public class TestaMedico {

	public static void main(String[] args) {
		Medico medico1 = new Medico(12345, "Ana Maria", 0, 250);
		Medico medico2 = new Medico(456789, "Antônio", 0, 300);
		
		medico1.pagamentoDinheiro();
		medico2.pagamentoPlano();
		
		Medico medicos[] = new Medico[Medico.getTotalMedicos()];
		
		medicos[0] = medico1;
		medicos[1] = medico2;
		
		for(int i = 0; i < Medico.getTotalMedicos(); i++) {
			System.out.println("\n" + medicos[i].imprimeMedico());
		}
		
		System.out.println("\nQuantidade de médicos: "
				+ Medico.getTotalMedicos());
	}

}
