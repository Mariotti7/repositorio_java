package orientacaoObjeto;

import java.util.Locale;
import java.util.Scanner;

import entities.Estoque;

public class Produto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estoque product = new Estoque();
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.nameProduct = sc.nextLine();
		System.out.print("Price: ");
		product.priceProduct = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.stockProduct = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product);//houve uma sobreposição do objeto para String
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock:  ");
		int quantity = sc.nextInt();//Variavel que vai somar a nova quantidade do estoque
		product.addProducts(quantity);//metodo que vai utilizar a função da classe colocando a variavel quantity como parametro
		
		System.out.println();
		System.out.println("update data: " + product);//atualiza os dados na quantidade com a função acima
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock:  ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("update data: " + product);
		
		sc.close();
}
}