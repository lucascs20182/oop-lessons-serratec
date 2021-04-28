package exercicios;

public class MainImovel {

	public static void main(String[] args) {
		Imovel imovel1 = new Imovel(1, "Centro", "apto", 25000);
		Imovel imovel2 = new Imovel(2, "Quitandinha", "casa", 98900);
		
		System.out.println("Imóvel 1: ");
		System.out.println("A categoria do imóvel é: " + imovel1.mostrarCategoria());
		System.out.println("O reajuste do imóvel passaria de " + imovel1.valor
				+ " para " + imovel1.calcularReajuste());
		
		System.out.println("\nImóvel 2: ");
		System.out.println("A categoria do imóvel é: " + imovel2.mostrarCategoria());
		System.out.println("O reajuste do imóvel passaria de " + imovel2.valor
				+ " para " + imovel2.calcularReajuste());
	}

}
