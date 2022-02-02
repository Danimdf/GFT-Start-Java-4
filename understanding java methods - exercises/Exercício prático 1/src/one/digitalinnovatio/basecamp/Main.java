package one.digitalinnovatio.basecamp;
import one.digitalinnovatio.basecamp.base.Calculadora;
import one.digitalinnovatio.basecamp.base.Mensagem;
import one.digitalinnovatio.basecamp.base.Emprestimo;

public class Main {

    public static void main(String[] args) {
        System.out.println("Exercício prático: Calculadora");
        Calculadora.soma(25, 34);
        Calculadora.sub(2, 1);
        Calculadora.mult(32, 2);
        Calculadora.div(111, 11);

        System.out.println("\nExercício prático: Mensagem");
        Mensagem.obterMensagem(11);
        Mensagem.obterMensagem(2);
        Mensagem.obterMensagem(0);

        System.out.println("\nExercício prático: Empréstimo");
        Emprestimo.calcular(1000, 2);
        Emprestimo.calcular(1000, 3);
        Emprestimo.calcular(1000, 5);
    }
}
