package one.digitalinnovation.basecamp;

public class Main {

    public static void main(String[] args) {

        byte b1;
        short s1 = 1000;
        b1 = (byte)s1;

        long l1;
        int i1 = 10;
        l1 = i1;

        int i2;
        long l2 = 100000000000000L;
        i2 = (int)l2;

        int i3;
        long l3 = 1000;
        i3 = (int)l3;

        double d1;
        float f1 = 10.5f;
        d1 = f1;

        float f2;
        float f3;
        double d2 = 1000.32d;
        f2 = (float) d2;
        double d3 = 10000.000000000000000000000000000000000000000000000;
        f3 = (float) d3;

        int i4;
        float f4 = 11.2323f;
        i4 = (int) f4;

        System.out.println(" b1: " + b1);
        System.out.println(" l1: " + l1);
        System.out.println(" i2: " + i2);
        System.out.println(" i3: " + i3);
        System.out.println(" d1: " + d1);
        System.out.println(" f2: " + f2);
        System.out.println(" f3: " + f3);
        System.out.println(" i4: " + i4);
    }
}
