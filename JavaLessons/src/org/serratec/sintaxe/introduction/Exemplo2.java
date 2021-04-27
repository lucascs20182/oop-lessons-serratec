package org.serratec.sintaxe.introduction;

public class Exemplo2 {
	public static void executar() {
		System.out.print("Lucas\n");
		System.out.print("Cruz");

		// tabulação
		System.out.print("\n\tLucas Cruz");

		// backspace: se \b\b apagará o "uz" do print acima
		// ao menos funciona no terminal
		System.out.println("\b\bLucas Cruz");

		// printa uma contra-barra (\)
		System.out.println("\\Lucas Cruz");

		// printa uma aspas simples (')
		System.out.println("\'Lucas Cruz");

		// printa uma aspas dupla (")
		System.out.println("\"Lucas Cruz");
	}
}
