package Java;

public class Cuadrado extends Figura{
	private double lado;

	public Cuadrado(String nombre, double lado) {
		super(nombre);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}
	
	public double getArea() {
		return lado * lado;
	}
	
	public String toString() {
		return "Cuadrado lado = " + lado;
	}
	
	
}
