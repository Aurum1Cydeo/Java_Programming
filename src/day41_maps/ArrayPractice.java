package day41_maps;

import java.util.*;

public class ArrayPractice {
    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>();
        list1.addAll((Arrays.asList(1, 2, 3, 4, 5, 6)));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll((Arrays.asList(7, 8, 9, 10, 11)));


        List<Integer> list3 = new ArrayList<>();
        list3.addAll((Arrays.asList(10, 20, 30, 40, 50, 60)));

        List<Integer>[] arrayOfLists = new List[3];
        arrayOfLists[0] = list1;
        arrayOfLists[1] = list2;
        arrayOfLists[2] = list3;
        System.out.println(Arrays.toString(arrayOfLists));

        arrayOfLists[0].set(4, 50);
        System.out.println(Arrays.toString(arrayOfLists));

        System.out.println("-------------------------------");

        Set<Integer>[] arrayOfSets = new Set[5];

        arrayOfSets[0] = new HashSet<>();
        arrayOfSets[1] = new HashSet<>();
        arrayOfSets[2] = new HashSet<>();
        arrayOfSets[3] = new HashSet<>();
        arrayOfSets[4] = new HashSet<>();

        System.out.println(Arrays.toString(arrayOfSets));

        arrayOfSets[2].addAll(Arrays.asList(1, 2, 3, 4));

        System.out.println(Arrays.toString(arrayOfSets));



    }
}
