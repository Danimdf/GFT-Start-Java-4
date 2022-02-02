package one.digitalinnovation.exercicios.loops.arrays;
import java.util.Scanner;

public class Consoantes {
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            //o metodo equalsIgnoreCase compara as strings e retorna true se forem iguais ou false se não forem (A e a são iguais para o método)
            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")))
            {
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }

            count++;

        } while (count < consoantes.length);

        System.out.print("Consoantes: ");
        for (String consoante : consoantes) {
            if (consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("\nQuantidade de consoantes: " + quantidadeConsoantes);
    }
}