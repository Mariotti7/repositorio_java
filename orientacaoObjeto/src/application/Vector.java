package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Vetor;

public class Vector {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);


		System.out.println("---- Booking.com > O SEU Site de Hospedagem ----");

		System.out.printf("How many rooms will be rented? ");
		int n = sc.nextInt();
		Vetor[] vect = new Vetor[10];
		for (int i = 1; i < n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Vetor(name, email);

		}
		System.out.println();
		System.out.println("Busy Rooms:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i].getName() + ", " + vect[i].getEmail());
			}
		}

		sc.close();

	}

}
