package orientacaoObjeto;

import java.util.Locale;
import java.util.Scanner;

import entities.List;

public class testando {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quem é você?");
		System.out.println("------------");
		
		List personA, personB;
		
		personA = new List();
		personB = new List();
		
		System.out.println("Digite seu nome: ");
		personA.name = sc.next();
		System.out.println("Digite seu sobrenome: ");
		personA.lastName = sc.next();
		System.out.println("Digite sua idade: ");
		personA.age = sc.nextInt();	
		
		System.out.println("Digite outro nome: ");
		personB.name = sc.next();
		System.out.println("Digite um sobrenome: ");
		personB.lastName = sc.next();
		System.out.println("Digite uma idade: ");
		personB.age = sc.nextInt();	
		
		
		System.out.printf("Olá, %s %s, você tem %d anos de idade\n",personA.name, personA.lastName, personA.age);
		System.out.printf("Olá, %s %s, você tem %d anos de idade\n",personB.name, personB.lastName, personB.age);
		
		sc.close();

	}

}
