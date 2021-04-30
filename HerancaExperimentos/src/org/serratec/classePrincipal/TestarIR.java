package org.serratec.classePrincipal;

import org.serratec.classes.PessoaFisica;
import org.serratec.classes.PessoaJuridica;

public class TestarIR {

	public static void main(String[] args) {
		PessoaFisica pessoa1 = new PessoaFisica("Matheus", 28559.70, "123456789-90", "12345678-5");
		PessoaJuridica pessoa2 = new PessoaJuridica("Adriana Ltda.", 28559.71, "345678919-90", "421232118-5");
		
		System.out.println(pessoa1.toString());
		System.out.println("Valor a pagar: " + pessoa1.calculeIR());
		
		System.out.println(); //pule uma linha
		
		System.out.println(pessoa2.toString());
		System.out.println("Valor a pagar: " + pessoa2.calculeIR());
	}

}
