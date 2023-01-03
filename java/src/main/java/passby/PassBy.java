package passby;

public class PassBy {
    static class Pair {
        int x;
        int y;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String x = "Hello";
        StringBuffer y = new StringBuffer("World");
        System.out.println("Before swap: a = " + a + ", b = " + b);
        swap(a, b);
        System.out.println("After swap: a = " + a + ", b = " + b);

        Pair p = new Pair();
        p.x = 10;
        p.y = 20;
        System.out.println("Before swap: p.x = " + p.x + ", p.y = " + p.y);
        swap(p);
        System.out.println("After swap: p.x = " + p.x + ", p.y = " + p.y);

        System.out.println(a);
        System.out.println(b);
        System.out.println(p);
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swap: a = " + a + ", b = " + b);
    }

    public static void swap(Pair p) {
        int temp = p.x;
        p.x = p.y;
        p.y = temp;
        System.out.println("Inside swap: p.x = " + p.x + ", p.y = " + p.y);
    }
}
