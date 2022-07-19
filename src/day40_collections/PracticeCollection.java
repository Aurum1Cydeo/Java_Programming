package day40_collections;

import java.util.ArrayList;
import java.util.*;

public class PracticeCollection {
    public static void main(String[] args) {
        Collection<Integer> collection=new ArrayList<>();
        collection.add(100);
        collection.addAll(Arrays.asList(100,200,300,400,500,600));

        System.out.println(collection);

        System.out.println(((ArrayList<Integer>) collection).get(2));

        System.out.println("-----------------------------------");

        Collection<Integer>collection2=new LinkedHashSet<>();

        collection2.addAll(Arrays.asList(100,200,300,400,50,600,700));

        System.out.println(collection2);

      //  System.out.println(((ArrayList)collection2).get(4));
        System.out.println(new ArrayList<>(collection2).get(4));//for 1 time use

        List <Integer> l=new ArrayList<>(collection2);
        System.out.println(l.get(4));


    }
}
