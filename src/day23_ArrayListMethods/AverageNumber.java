package day23_ArrayListMethods;

import java.util.ArrayList;

public class AverageNumber {
    public static void main(String[] args) {


       // Write a program that can find the average number from an arrayList of integers

        ArrayList<Integer> list= new ArrayList<>();

        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);


        System.out.println(list);
        int sum=0;
        for (Integer each : list) {
            sum += each;
            // int averNum=sum/6;
        }
        double average = sum/(double)list.size();
        System.out.println(sum);



    }
}
