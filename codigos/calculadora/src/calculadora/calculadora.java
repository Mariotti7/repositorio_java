package calculadora;

import java.util.Locale;
import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("=======================================");
		System.out.println("Calcule seu Valor Metab�lico em Repouso");
		System.out.println("=======================================");

		System.out.println("Digite seu peso: ");
		double peso = sc.nextDouble();
		sc.nextLine();

		System.out.println("Escolha m para Masculino ou f para Feminino: ");
		char masc = 'm';
		char fem = 'f';
		double calMasculino = 24.2 * peso;
		double calFeminino = 22.0 * peso;
		char sexo = sc.next().charAt(0);
		while (sexo == masc || sexo == fem) {
			if (sexo == masc) {
				sc.nextLine();
				System.out.println("Voc� escolheu: Masculino");
				System.out.printf("Voc� digitou o peso: %.2fkg%n", peso);
				System.out.printf("O m�nimo de calorias por dia que seu corpo precisa � de: %.2fKcal%n ", calMasculino);
				break;
			} else if (sexo == fem) {
				sc.nextLine();
				System.out.println("Voc� escolheu: Feminino");
				System.out.printf("Voc� digitou o peso: %.2fkg%n", peso);
				System.out.printf("O m�nimo de calorias por dia que seu corpo precisa � de: %.2fKcal%n ", calFeminino);
				break;
			}
		}
		sc.nextLine();

		System.out.println("================================");
		System.out.println("FIM");
		System.out.println("================================");

		sc.close();
	}
}
