package day40_collections;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> queue1 = new PriorityQueue<>();
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
       // queue1.addAll(Arrays.asList(null,null,null));//null is not accepted
        System.out.println(queue1);

       int num1 = queue1.poll();// it means FIFO

        System.out.println(queue1);
        queue1.poll();
        queue1.poll();
        queue1.poll();
        System.out.println(queue1);
        System.out.println("-------------------------------------");

        Queue<Integer> queue2 = new ArrayDeque<>();//insertion order always kept
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        System.out.println(queue2);

        queue2.poll();
        System.out.println(queue2);
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();

        System.out.println(queue2);



        Queue<Integer> queue3 = new LinkedList<>();


        Queue<Integer> queue4 = new LinkedList<>();


        System.out.println("-------------------------------------");
        List<Integer> list = new LinkedList<>();


    }
}
