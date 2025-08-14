package introducao_POO;

public class Livro {
	String titulo;
	String autor;
	int ano;
	void exibir() {System.out.println("O titulo do livro: " + titulo + 
			". O nome do autor: " + autor + 
			". O ano de lancamento: " + ano);}
	public static void main(String[] args) {
		Livro livro1 = new Livro();
		livro1.titulo = "Extraordinario";
		livro1.autor = "Raquel Jaramillo Palacio";
		livro1.ano = 2012;
		livro1.exibir();
	}
}
