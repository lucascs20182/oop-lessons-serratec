package org.serratec.exercicio;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("Adriano", 3000);
		String mensagem = "";
				
		mensagem += "Nome: " + funcionario1.getNome();
		mensagem += "\nSalário: " + funcionario1.getSalario();
		mensagem += "\nINSS: " + funcionario1.calcularInss();
		mensagem += "\nVale Transporte: " + funcionario1.calcularValeTransporte();
		mensagem += "\nSalário Líquido: " + funcionario1.calcularSalarioLiquido();

		JOptionPane.showMessageDialog(null, mensagem);
	}

}
