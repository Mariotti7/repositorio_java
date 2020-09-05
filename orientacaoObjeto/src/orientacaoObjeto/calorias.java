package orientacaoObjeto;

import java.util.Locale;
import java.util.Scanner;

import entities.Metabolico;

public class calorias {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("INICIO DO PROGRAMA...");
		Metabolico kcal = new Metabolico();
		System.out.println("Informe seu peso corporal: ");
		kcal.peso = sc.nextDouble();
		System.out.println("Digite 0 para masculino ou 1 para feminino: ");
		kcal.gender = (double) sc.nextDouble();
		//double kal = cal.genders(kal);
		System.out.println(kcal);
		System.out.println("...FIM DO PROGRAMA");
		
		sc.close();

	}

}
