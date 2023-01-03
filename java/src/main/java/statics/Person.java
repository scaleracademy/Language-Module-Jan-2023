package statics;

public class Person {
    String name;
    int age;
    Behaviour behaviour;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.behaviour = new Behaviour(true, false, false);
    }

    public Person(String name, int age, boolean happy, boolean confident, boolean introverted) {
        this.name = name;
        this.age = age;
        this.behaviour = new Behaviour(happy, confident, introverted);
    }

    class Behaviour {
        boolean happy;
        boolean confident;
        boolean introverted;

        public Behaviour(boolean happy, boolean confident, boolean introverted) {
            this.happy = happy;
            this.confident = confident;
            this.introverted = introverted;
        }
    }

    static class Builder {
        String name;
        int age;
        boolean happy;
        boolean confident;
        boolean introverted;

        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Builder happy(boolean happy) {
            this.happy = happy;
            return this;
        }

        public Builder confident(boolean confident) {
            this.confident = confident;
            return this;
        }

        public Builder introverted(boolean introverted) {
            this.introverted = introverted;
            return this;
        }

        public Person build() {
            return new Person(
                this.name,
                this.age,
                this.happy,
                this.confident,
                this.introverted
            );
        }
    }
}
