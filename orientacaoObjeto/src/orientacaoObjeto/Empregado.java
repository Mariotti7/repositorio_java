package orientacaoObjeto;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Empregado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Employee dados = new Employee();
		System.out.print("Name: ");
		dados.name = sc.nextLine();
		System.out.print("Gross salary: ");
		dados.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		dados.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println(dados);
		
		System.out.print("Wich percentage to increase salary? ");
		double increase = sc.nextDouble();
		dados.increaseSalary(increase);
		
		System.out.println();
		System.out.print("Update data: " + dados);
		
		sc.close();

	}

}
