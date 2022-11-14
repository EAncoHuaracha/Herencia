package JavaTipo;

public class Main {
	public static void main(String[] args) {

		Calculo f = new Cuadrado(5);
		area(f);
		perimetro(f);
		
		f = new Triangulo(3, 2);
		area(f);
		perimetro(f);

	}

	public static void area(Calculo c) {
		System.out.println("Area = " + c.area());
	}
	
	public static void perimetro(Calculo c) {
		System.out.println("Perimetro = " + c.perimetro());
	}
}
