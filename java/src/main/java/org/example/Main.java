package org.example;

public class Main {
    static class Fruit {
        private String taste = "sweet";
        public String getTaste() {
            return taste;
        }
    }

    static class Mango extends Fruit {
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Fruit f = new Mango();
//        Mango m = new Fruit();
        Mango m = new Mango();
        System.out.println(m.getTaste());
    }
}