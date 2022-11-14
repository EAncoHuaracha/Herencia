package JavaTipo;

public class Triangulo implements Calculo{
	
	private double base;
	private double altura;

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public Double area() {
		return base * altura / 2;
	}

	public Double perimetro() {
		return 3 * base;
	}
}

