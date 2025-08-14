package introducao_POO;

public class Triangulo {
	double LadoA;
	double LadoB;
	double LadoC;
	
	boolean formaTriangulo() { return (LadoA + LadoB > LadoC) && (LadoA + LadoC > LadoB) && 
			(LadoC + LadoB > LadoA); }
	
	String obterTipo() {if (!formaTriangulo()) {
		return null;
	} if (LadoA == LadoB && LadoA == LadoC) {
		return "Equilatero";
	} if (LadoA != LadoB && LadoA != LadoC && LadoB != LadoC) {
		return "Escaleno";
	} else  {
		return "Isosceles";
	}
	
}
	
	public static void main(String[] args) {
		Triangulo triangulo1 = new Triangulo();
		triangulo1.LadoA = 10;
		triangulo1.LadoB = 16;
		triangulo1.LadoC = 14;
		 System.out.println("Tipo do triangulo1: " + triangulo1.obterTipo());
	}
}
