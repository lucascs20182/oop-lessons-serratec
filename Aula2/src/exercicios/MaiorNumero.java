package exercicios;

public class MaiorNumero {

	public static void main(String[] args) {
		int numero1 = 15;
		int numero2 = 16;
		
		String resultado = "O maior n�mero �: ";
		
		if(numero1 > numero2) {
			resultado += numero1;
		} else if(numero1 == numero2) {
			resultado = "Os n�meros s�o iguais.";
		}
		else {
			resultado += numero2;
		}
		
		System.out.println(resultado);
	}
}
