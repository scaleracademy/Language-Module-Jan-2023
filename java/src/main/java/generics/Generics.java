package generics;

import java.sql.Array;
import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {


        var arrayList = new ArrayList<>();

        ArrayList<Integer> intList = new ArrayList<Integer>();


        arrayList.add(12);
        arrayList.add("Hello");
        arrayList.add(true);

        intList.add(12);
        ((ArrayList) intList).add("Hello");
        ((ArrayList) intList).add(true);

        System.out.println(arrayList);
        System.out.println(intList);
    }
}
