package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Vetor;

public class Vector {

	public static void main(String[] args) {
		// if (vect[i] != null)
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int n = 0;
		
		
		
		System.out.println("---- Booking.com > O SEU Site de Hospedagem ----");
		
		System.out.printf("How many rooms will be rented?");
		n = sc.nextInt();
		Vetor[] vect = new Vetor[n];
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.printf("Digite seu nome: ");
			String name = sc.nextLine();
			System.out.printf("Digite seu email: ");
			String email = sc.nextLine();
			vect[i] = new Vetor(name, email);
			vect[5].setName("Maria Green");
			vect[5].setEmail("maria@gmail.com");
			vect[1].setName("Marco Antonio");
			vect[1].setEmail("marco@gmail.com");
			vect[8].setName("Alex Brown");
			vect[8].setEmail("alex@gmail.com");
			if(vect[i] != null) {
				System.out.println("Busy Rooms:\n");
				System.out.println("1: "+vect[1].getName() + ", "+vect[1].getEmail());
				System.out.println("5: "+vect[5].getName()+ ", "+vect[5].getEmail());
				System.out.println("8: "+vect[8].getName()+ ", "+vect[8].getEmail());
			}else {
				System.out.println("erro");
			}
		}
		
		
		
		sc.close();

	}

}
