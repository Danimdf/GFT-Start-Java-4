package one.digitalinnovatio.basecamp.base;

public class Emprestimo {

    public static void calcular(double valor, int parcelas) {
        if (parcelas == 2) {
            getDuasParcelas(valor);
        } else if (parcelas == 3) {
            getTresParcelas(valor);
        } else {
            System.out.println("Quantidade de parcelas não aceita.");
        }
    }

    public static int getDuasParcelas(double valor) {
        double valorFinal = valor + (valor * 0.3);
        System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
        return 0;
    }

    public static int getTresParcelas(double valor) {
        double valorFinal = valor + (valor * 0.45);
        System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
        return 0;
    }
}

