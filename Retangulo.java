package introducao_POO;

public class Retangulo {
	double comprimento;
	double largura;
	double area;
	void doublecalcularÁrea() {area = comprimento * largura;}
	void exibir() {System.out.println("A area do retangulo é: " + area);}
	public static void main(String[] args) {
		Retangulo rentangulo1 = new Retangulo();
		rentangulo1.comprimento = 10;
		rentangulo1.largura = 8;
		rentangulo1.doublecalcularÁrea();
		rentangulo1.exibir();
	}
}
