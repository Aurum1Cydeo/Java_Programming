package arrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arraysTasks {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list.set(list.size()-1,0 );//replace last value of index to 0
        System.out.println(list);

        System.out.println("-------------------------------------------------");


        String [] arr1 = {"A", "B", "C"};
        String [] arr2 = {"D", "A", "B", "G"};
        String [] arr4=Arrays.copyOfRange(arr2,0,3);

        ArrayList <String> arr3 =  new ArrayList<>();//declared arr3
        arr3.addAll(Arrays.asList(arr1));//add arr1 into arr3
        arr3.addAll(Arrays.asList(arr2));//add arr2 into arr3
        System.out.println(arr3);

        System.out.println("arr4 "+Arrays.toString(arr4));

        System.out.println("-------------------------------------------------");

        ArrayList <String> names =  new ArrayList<>();
        names.addAll(Arrays.asList("John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"));
        names.removeAll(Arrays.asList("Ahmed"));
        System.out.println(names);

        System.out.println("----------------------------------------------------");

        ArrayList <Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5));
        numbers.addAll(numbers);

        System.out.println(numbers);

        System.out.println("-----------------------------------------------------");


        ArrayList <Integer> largestNumber = new ArrayList<>();

      largestNumber.addAll(Arrays.asList(1,2,3,4,5,6,7,10,7,8,8,9,9,10,11,12));
        ArrayList <Integer> nonDup = new ArrayList<>();
        int num =5;

        for (Integer each : largestNumber) {
            if(nonDup.contains(each)){//remove all duplicates
                continue;
            }
        nonDup.add(each);//without duplicates
        }
       Collections.sort(nonDup);//sort in ascending order

        System.out.println(nonDup.get(nonDup.size()-num));












    }
}
