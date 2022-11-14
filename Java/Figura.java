package Java;

public class Figura {
	private String nombre;
	private double area;
	
	public Figura(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public double getArea() {
		return area;
	}

	public String toString() {
		return "Figura nombre = " + nombre;
	}
	
}
