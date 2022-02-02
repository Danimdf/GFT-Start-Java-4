package one.digitalinnovation.basecamp;

public class Main {

    public static void main(String[] args) {

        int a1 = 10;
        int a2 = 20;
        float fl1 = 4.5f;
        float fl2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "gatinho";
        String s2 = "gatinho2";
        String s3 = "gatinho3";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1597L;
        long l2 = 8997L;
        byte y1 = 1;
        short h1 = 25;

        System.out.println("a1 == a2 " + (a1 == a2));
        System.out.println("a1 != a2 " + (a1 != a2));
        System.out.println("a1 > a2 " + (a1 > a2));
        System.out.println("a1 <= a2 " + (a1 <= a2));

        System.out.println("fl1 == fl2 " + (fl1 == fl2));
        System.out.println("fl1 != fl2 " + (fl1 != fl2));
        System.out.println("fl1 >= fl2 " + (fl1 >= fl2));
        System.out.println("fl1 < fl2 " + (fl1 < fl2));

        System.out.println("c1 == c2 " + (c1 == c2));
        System.out.println("c1 != c2 " + (c1 != c2));
        System.out.println("c1 > c2 " + (c1 > c2));
        System.out.println("c1 <= c2 " + (c1 <= c2));

        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 == s3 " + (s1 == s3));
        System.out.println("s1 != s2 " + (s1 != s2));

        System.out.println("b1 == b2 " + (b1 == b2));
        System.out.println("b1 != b2 " + (b1 != b2));

        System.out.println("a2 > fl1 " + (a2 > fl1));
        System.out.println("d1 == h1 " + (d1 == h1));

        System.out.println("l1 == a2 " + (l1 == a2));
        System.out.println("l2 >= a1 " + (l2 >= a1));
        System.out.println("y1 != h1 " + (y1 != h1));
    }
}
