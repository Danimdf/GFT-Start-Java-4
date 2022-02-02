package one.digitalinnovation.oo.ExInterface;

class Calculadora implements OperacaoMatematica {

//Obrigar um terceiro a implementar esses metodos de dentro da interface

    @Override
    public void soma(double operando1, double operando2) {
        System.out.println("Soma: " + operando1 + operando2);
    }

    @Override
    public void subtracao(double operando1, double operando2) {
        System.out.println("Subtracao: " + (operando1 - operando2));
    }

    @Override
    public void multiplicacao(double operando1, double operando2) {
        System.out.println("multiplicacao: " + operando1 * operando2);
    }

    @Override
    public void divisao(double operando1, double operando2) {
       System.out.println("multiplicacao: " + operando1 / operando2);
    }

}
