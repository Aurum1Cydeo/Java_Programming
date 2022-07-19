package day39_Collections;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.get(0);

        List<Integer> linkedList = new LinkedList<>();
        linkedList.get(0);
        System.out.println("-----------------------------------");

        Vector<Integer> vector = new Vector<>();
        vector.add(100);
        vector.add(200);
        vector.add(300);
        System.out.println("-----------------------------------");

        Stack<Integer> stack = new Stack<>();
        stack.add(100);
        stack.add(200);
        stack.add(300);

    }
}
