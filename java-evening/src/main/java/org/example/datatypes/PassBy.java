package org.example.datatypes;

public class PassBy {

    static class Pair {
        int x;
        int y;

        public Pair clone() {
            Pair p = new Pair();
            p.x = x;
            p.y = y;
            return p;
        }
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        Pair p = new Pair();
        p.x = 5;
        p.y = 10;
        Pair q = p; // not a copy
        Pair r = p.clone(); // an actual copy
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("p.x = " + p.x + ", p.y = " + p.y);
        swap(x, y);
        swap(p);
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("p.x = " + p.x + ", p.y = " + p.y);
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void swap(Pair p) {
        int temp = p.x;
        p.x = p.y;
        p.y = temp;
    }
}
