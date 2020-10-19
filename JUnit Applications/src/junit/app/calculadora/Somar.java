package junit.app.calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Somar {

	// metodo simples de soma
	public double soma(double num1, double num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {

		// aplicação simples a partir da leitura de 2 numeros interagindo com a
		// implementação do metodo de soma

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Somar soma = new Somar();

		double num1, num2;

		System.out.println("==== Calculadora de Soma ====");
		System.out.print("");
		num1 = sc.nextDouble();
		System.out.println("+");
		System.out.print("");
		num2 = sc.nextDouble();
		System.out.println("=");
		System.out.println(soma.soma(num1, num2));

		sc.close();

	}

}
