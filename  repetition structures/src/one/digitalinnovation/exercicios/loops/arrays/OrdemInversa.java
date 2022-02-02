package one.digitalinnovation.exercicios.loops.arrays;

public class OrdemInversa {

    public static void main(String[] args) {

        int[] vetor = {-10, -23, 45, 12, 6, 2};

        System.out.print("Vetor original: ");

        int count =0;
        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor invertido: ");
        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
