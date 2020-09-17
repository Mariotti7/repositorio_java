package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Client;

public class Account {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int numberHolder = sc.nextInt();
		System.out.print("Enter account holder: ");
		String accountHolder = sc.next();
		System.out.print("Is there an initial deposit (y/n): ");
		char deposite = sc.next().charAt(0);
		System.out.print("Enter an initial deposite value: ");
		double depositBalance = sc.nextDouble();
		Client holder = new Client(numberHolder, accountHolder, depositBalance, deposite);

		System.out.println();
		System.out.println("Account data:");
		System.out.println(holder);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double depositeValue = sc.nextDouble();
		holder.addDepositeValue(depositeValue);
		System.out.println("\nUpdated account data:");
		System.out.println(holder);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withDrawValue = sc.nextDouble();
		holder.withDrawValue(withDrawValue);
		System.out.println("\nUpdated account data:");
		System.out.println(holder);
		

		sc.close();

	}

}
