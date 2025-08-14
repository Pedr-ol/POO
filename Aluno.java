package introducao_POO;
import java.lang.System;
public class Aluno {
    String nome;
    String curso;
    int idade;

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Pedro";
        aluno1.curso = "Ciência da Computação";
        aluno1.idade = 19;

        System.out.println("Seu nome é " + aluno1.nome +
                           ". Seu curso é " + aluno1.curso +
                           " e você tem " + aluno1.idade + " anos.");
    }
}
