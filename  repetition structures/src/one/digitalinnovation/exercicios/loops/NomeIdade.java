package one.digitalinnovation.exercicios.loops;
import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0"))
                break;

            System.out.println("Idade: ");
            idade = scan.nextInt();

            System.out.println("Meu nome é: " + nome);
            System.out.println("E minha idade é: " + idade);
                break;
        }
    }
}
