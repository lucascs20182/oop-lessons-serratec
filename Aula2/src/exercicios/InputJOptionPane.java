package exercicios;

import javax.swing.JOptionPane;

public class InputJOptionPane {
	public static void main(String[] args) {
		String nome = "";
		int resposta;
		
		nome = JOptionPane.showInputDialog("Qual � o seu nome?");
		resposta = JOptionPane.showConfirmDialog(null, "O seu nome � " + nome + " ?");
		
		System.out.println(resposta);
	}
}
