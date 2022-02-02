package one.digitalinnovatio.basecamp.base;



public class Calculadora {

    public static void soma(double num1, double num2) {
        double somaResultado = num1 + num2;
        System.out.println("A soma de " + num1 + " mais " + num2 + " é: " + somaResultado);
    }

    public static void sub(double num1, double num2) {
        double subResultado = num1 - num2;
        System.out.println("A subtração de " + num1 + " menos " + num2 + " é: " + subResultado);
    }

    public static void mult(double num1, double num2) {
        double multResultado = num1 * num2;
        System.out.println("A multiplicação de " + num1 + " vezes " + num2 + " é: " + multResultado);
    }

    public static void div(double num1, double num2) {
        double divResultado = num1 / num2;
        System.out.println("A divisão de " + num1 + " dividido por " + num2 + " é: " + divResultado);
    }
}
