package one.digitalinnovation.basecamp;
import one.digitalinnovation.basecamp.base.Quadrilatero;

public class Main {

    public static void main(String[] args) {
        System.out.println("Exercício prático: ");

        double areaQuadrado = Quadrilatero.area(5);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(6,3);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(10,2,5);
        System.out.println("Área do trapézio:" + areaTrapezio);

    }
}
