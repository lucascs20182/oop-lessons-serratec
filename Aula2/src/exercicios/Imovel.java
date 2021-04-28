package exercicios;

public class Imovel {
	int codImovel;
	String bairro;
	String tipo;
	double valor;
	
	public Imovel(int codImovel, String bairro, String tipo, double valor) {
		this.codImovel = codImovel;
		this.bairro = bairro;
		this.tipo = tipo;
		this.valor = valor;
	}
	
	double calcularReajuste() {
		if(this.tipo.equals("casa") ) {
			return this.valor + this.valor * 0.05; 
		} else {
			return this.valor + this.valor * 0.08; 
		}
	}
	
	String mostrarCategoria() {
		if(this.valor < 10000) {
			return "Categoria C";
		} else if(this.valor >= 10000 && this.valor < 50000) {
			return "Categoria B";
		} else {
			return "Categoria A";
		}
	}
}
