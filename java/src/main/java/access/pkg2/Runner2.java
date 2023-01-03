package access.pkg2;

import access.pkg1.ParentClass1;

public class Runner2 {

    public static void main(String[] args) {
        // We are inside different package from ParentClass1, also not inherited from it

        ParentClass1 parentClass1 = new ParentClass1();
        // System.out.println(parentClass1.privateField);
        // System.out.println(parentClass1.protectedField);
        // System.out.println(parentClass1.defaultField);
        System.out.println(parentClass1.publicField);
    }
}
