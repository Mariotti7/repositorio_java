package entities;

public class Estoque {
	
	public String nameProduct;
	public double priceProduct;
	public int stockProduct;
	
	public double totalValueInStock() {
		return priceProduct * stockProduct;
	}
	
	public void addProducts(int stockProduct) {//metodo que vai somar ou subtrair do parametro
		this.stockProduct += stockProduct; //acessando o produto da classe
	}
	
	public void removeProducts(int stockProduct) {//metodo que vai somar ou subtrair do parametro
		this.stockProduct -= stockProduct; //acessando o produto da classe
	}
	
	public String toString() {//sobrepor a operação padrao / imprimir a minha versao da String
		return nameProduct 
				+ ", $ " 
		        + String.format("%.2f", priceProduct) //delimitando as casas decimais
				+ ", " 
		        + stockProduct 
		        + " units, Total: $ " 
				+ String.format("%.2f", totalValueInStock());
	}
	
}
