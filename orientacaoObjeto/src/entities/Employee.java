package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	public double percentage;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary = grossSalary +(grossSalary * percentage / 100.00); //parametro recebe o valor 
	}
	
	public String toString() {
		return "Employee: "
				+ name
				+ ", "
				+ "$ "
				+ String.format("%.2f%n", netSalary())
				;
	}
}
