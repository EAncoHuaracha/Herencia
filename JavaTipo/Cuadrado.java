package JavaTipo;

public class Cuadrado implements Calculo{
	private double lado;

	public Cuadrado(double lado) {
		this.lado = lado;
	}

	public Double area() {
		return lado * lado;
	}

	public Double perimetro() {
		return 4 * lado;
	}
}
