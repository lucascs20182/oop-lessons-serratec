package exercicios;

public class ParesEImparesEOutrasCoisasMais {

	public static void main(String[] args) {
		int pares = 0;
		int impares = 0;
		int multiplosDeDois = 0;
		
		for (int i = 0; i <= 30; i++) {
			if(i % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}

		System.out.println("Pares: " + pares);
		System.out.println("�mpares: " + impares + "\n");
		
		for (int i = 1; i <= 22; i++) {
			if(i % 2 == 0) {
				System.out.print("Java ");
				multiplosDeDois++;
			}
		}
		
		System.out.println("\nTotal de m�ltiplos de 2: " + multiplosDeDois + "\n");
		
		for (int i = 2; i <= 2; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "x" + j + " = " + i * j);
			}
		}
	}

}
