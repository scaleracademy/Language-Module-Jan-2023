package statics;

public class FancyClass {

    class FancierClass {

    }

    static class NotSoFancyClass {

    }

    void fancyStuff () {
        var fancy = new FancierClass();
        var notSoFancy = new NotSoFancyClass();
    }
}
