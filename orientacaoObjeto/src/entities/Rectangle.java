package entities;

public class Rectangle {

	public double width;
	public double height;
	
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return  (width * 2)+(height * 2);
	}
	
	public double diagonal() {
		return Math.sqrt((width * width) + (height * height));
	}
	
	public String toString() {
		return "AREA = "
				+ String.format("%.2f%n",area())
				+ "PERIMETER = " 
				+ String.format("%.2f%n", perimeter())
				+ "DIAGONAL = " 
				+ String.format("%.2f%n", diagonal())
				;
	}
}
