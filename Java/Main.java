package Java;

public class Main {
	public static void main(String[] args) {
		
		Figura f = new Figura("Figura");
		System.out.println(f.toString());
		
		
		f = new Triangulo("Triangulo", 5, 6);
		System.out.println(f.toString());
		System.out.println(f.getArea());
		
		
		f = new Cuadrado("Cuadrado", 5);
		System.out.println(f.toString());
		System.out.println(f.getArea());
		
	}
}
