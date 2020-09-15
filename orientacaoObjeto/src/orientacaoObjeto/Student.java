package orientacaoObjeto;
import java.util.Locale;
import java.util.Scanner;

import entities.Notas;

public class Student {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Notas nota = new Notas();
		System.out.println("----- FECHAMENTO ANUAL -----");
		System.out.print("Digite seu nome: ");
		nota.name = sc.nextLine();
		System.out.print("Informe a primeira nota: ");
		nota.nota1 = sc.nextDouble();
		System.out.print("Informe a segunda nota: ");
		nota.nota2 = sc.nextDouble();
		System.out.print("Informe a terceira nota: ");
		nota.nota3 = sc.nextDouble();
		
		System.out.println();
		System.out.println(nota);
		sc.close();
	}

}
