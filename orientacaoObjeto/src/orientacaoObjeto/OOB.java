package orientacaoObjeto;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class OOB {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva as medidas dos lados de dois tri�ngulos X e Y");
		System.out.println(" ");
		System.out.println("Descubra qual dos dois tri�ngulos tem a maior �rea!");
		System.out.println(" ");
		System.out.println("Entre com as medidas do tri�ngulo X: ");
		
		Triangle x, y; 
		x = new Triangle();
		y = new Triangle();
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		double area, p;
		p = (x.a + x.b + x.c)/2;
		area = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		System.out.println("Entre com as medidas do tri�ngulo Y: ");
		
		y.a = sc.nextDouble();
		y.b= sc.nextDouble();
		y.c= sc.nextDouble();
		
		double areaY, pY;
		pY = (y.a + y.b + y.c)/2;
		areaY = Math.sqrt(pY * (pY - y.a) * (pY - y.b) * (pY - y.c));
		
		System.out.printf("�rea Tri�ngulo X: %.2f%n", area);
		System.out.printf("�rea Tri�ngulo Y: %.2f%n", areaY);
		
		if(area > areaY) {
			System.out.println("Maior �rea: X");
		}else {
			System.out.println("Maior �rea: Y");
		}
		
		sc.close();

	}

}
