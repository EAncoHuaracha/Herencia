package Java;

public class Triangulo extends Figura{
	private double base;
	private double altura;

	public Triangulo(String nombre, double base, double altura) {
		super(nombre);
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	public double getArea() {
		return base * altura / 2;
	}

	public String toString() {
		return "Triangulo base=" + base + ", altura=" + altura;
	}
	
}
