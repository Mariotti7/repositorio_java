package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for(int i = 0 ; i < vect.length ; i++) { // pode ser i < n
			sc.nextLine();
			System.out.printf("Digite o nome do produto: ");
			String name = sc.nextLine();
			System.out.printf("Digite o pre�o: ");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();//pegar somente o pre�o
		}
		
		double avg = sum / vect.length;
		
		System.out.println();
		System.out.printf("AVERAGE PRICE: $ %.2f%n", avg);
		
		
		sc.close();

	}

}
