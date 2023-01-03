package access.pkg1;

public class Runner1 {

    public static void main(String[] args) {
        // We are inside same package as ParentClass1, but not inherited from it

        ParentClass1 parentClass1 = new ParentClass1();
        // System.out.println(parentClass1.privateField);
        System.out.println(parentClass1.protectedField);
        System.out.println(parentClass1.defaultField);
        System.out.println(parentClass1.publicField);
    }
}
