package one.digitalinnovatio.basecamp.base;

public class Mensagem {

    public static void obterMensagem(int hora) {
        int[] manha = {5,6,7,8,9,10,11,12};
        int[] tarde = {13,14,15,16,17};
        int[] noite = {18,19,20,21,22,23,0,1,2,3,4};

        for (int j : manha) {
            if (hora == j) {
                System.out.println("Bom Dia!");
            }
        }
        for (int j : tarde) {
            if (hora == j) {
                System.out.println("Bom Tarde!");
            }
        }
        for (int j : noite) {
            if (hora == j) {
                System.out.println("Boa Noite!");
            }
        }
    }
}
