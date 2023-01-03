package access.pkg2;

import access.pkg1.ParentClass1;

public class ChildClass1 extends ParentClass1 {

    void method() {
        ParentClass1 parentClass1 = new ParentClass1();
        // System.out.println(privateField);
        System.out.println(protectedField);
        // System.out.println(defaultField);
        System.out.println(publicField);
    }
}
