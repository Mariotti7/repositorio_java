package entities;

public class Notas {
			//Ler nome do aluno *
			//3 notas que obteve nos 3 trimestres(primeiro vale 30 e o resto 35) *
			//Se passou ou nao (PASS or FAILED)
			//Em caso negativo quantos pontos faltam para ser aprovado(60% da nota)
			
			public String name;
			public double nota1;
			public double nota2;
			public double nota3;
			public double soma;
			
			public double notas1() {
				return nota1 * 30.0;
			}
			
			public double notas2() {
				return nota2 * 35.0;
			}
			
			public double notas3() {
				return nota3 * 35.0;
			}
			
			public double somar() {
				return nota1 + nota2 + nota3;
			}
			
			public String result() {
				if(somar() >= 60.0) {
					return "\nPASS";
				}else {
					return "\nFAILED \nMISSING " + (String.format("%.2f", 60.0 - somar())) + " POINTS";
				}
			}
			
			public String toString() {
			return "Aluno: "
					+ name
					+ "\n"
					+ "FINAL GRADE = "
					+ String.format("%.2f", somar())
					+  result();
			}
}
