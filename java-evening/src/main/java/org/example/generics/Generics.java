package org.example.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("hello");
        list.add(1);
        list.add(true);
        System.out.println(list);

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        ((ArrayList) intList).add("hello");
        System.out.println(intList);

        List<Integer> intList2 = new LinkedList<>();
        LinkedList<Integer> intList3 = new LinkedList<>();

        ((LinkedList<Integer>)intList2).peek();
        intList3.peek();


    }
}
