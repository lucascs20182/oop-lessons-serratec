package exercicios;

public class MaiorNumero {

	public static void main(String[] args) {
		int numero1 = 15;
		int numero2 = 16;
		
		String resultado = "O maior número é: ";
		
		if(numero1 > numero2) {
			resultado += numero1;
		} else if(numero1 == numero2) {
			resultado = "Os números são iguais.";
		}
		else {
			resultado += numero2;
		}
		
		System.out.println(resultado);
	}
}
