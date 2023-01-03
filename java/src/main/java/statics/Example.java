package statics;

import java.util.Collections;
import java.util.Random;

public class Example {
    public static void main(String[] args) {
        var list = Collections.emptyList();

        FancyClass.NotSoFancyClass notSoFancy = new FancyClass.NotSoFancyClass();
        // FancyClass.FancierClass fancier = new FancyClass.FancierClass();

        var person = new Person("John", 30);
        System.out.println(person.name + " is happy ? " + person.behaviour.happy);


        var personBuilder = new Person.Builder("John", 30);
        var happyConfidentJohn = personBuilder.happy(true).confident(true).build();
        var sadIntrovertedJohn = personBuilder.happy(false).introverted(true).build();

    }
}
