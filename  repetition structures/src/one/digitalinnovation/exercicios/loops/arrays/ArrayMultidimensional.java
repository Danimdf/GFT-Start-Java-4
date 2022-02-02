package one.digitalinnovation.exercicios.loops.arrays;
import java.util.Random;

public class ArrayMultidimensional {

    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        for(int i = 0; i < M.length; i++) {
            for( int j = 0; j < M[i].length; j++) {
                M[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz 4X4: ");
        for (int[] linha : M  ) {
            for (int elementoDaColuna : linha ) {
                System.out.print(elementoDaColuna + " ");
            }
            System.out.println();
        }
    }
}
