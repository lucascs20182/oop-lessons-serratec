package exercicios;

public class SituacaoAluno {

	public static void main(String[] args) {
		double nota1 = 1 + (int) (Math.random() * 10); // de 1 a 10
		double nota2 = 1 + (int) (Math.random() * 10);
		
		double media = (nota1 + nota2) / 2;
		
		String resultado = "";
		
		resultado = media >= 7 ? "Aprovado " : "Reprovado";
		
		if(media == 10) {
			resultado += "Parab?ns";
		}
		
		System.out.println(nota1 + " " + nota2);
		System.out.println(resultado);
	}

}
