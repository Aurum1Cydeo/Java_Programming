package day40_collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterableExample {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14));
     /*   for (Integer each : list) {
            if(each<5){
                list.remove(each);ConcurrentModificationException
            }
        }
        for (int i=0;i<list.size();i++){ this loop doesn't work because size is dynamic,
        once element removes the next element shifts so the if condition skipped for that element
            if(list.get(i)<5){
                list.remove(i);
            }
        }*/
        System.out.println(list);

        System.out.println("---------------------------------------");

        List<Integer> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14));

        Iterator<Integer> it = list2.iterator();

        while(it.hasNext()){
            Integer each=it.next();
            if(each <5){
                it.remove();
            }
        }
        System.out.println(list2);

        System.out.println("---------------------------------------");


        List<Integer> list3 = new LinkedList<>();
        list3.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14));


        for (Iterator <Integer> i=list3.iterator(); i.hasNext(); ) {
          Integer each=  i.next();

          if(each<5){
              i.remove();
          }
        }

        System.out.println(list3);
        System.out.println("-------------------------");

        List<Integer> list4 = new LinkedList<>();
        list4.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14));

       // list4.removeIf(p->p<5||p>10);
        list4.removeIf(each->each<5);//removeIf method implicitly use while loop with Iterable
        System.out.println(list4);

        System.out.println("-------------------------");
        List<Integer> list5 = new LinkedList<>();
        list5.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14));

        list5.removeIf(p->p<5);
        System.out.println(list5);

    }
}
