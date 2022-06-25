package day23_ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListConversion {
    public static void main(String[] args) {
        
        String[] arr={"A","B","C","D"};
       ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println("list = " + list);

        System.out.println("----------------------------------------");

        ArrayList<String> list2=new ArrayList<>(Arrays.asList("Java","Python","C#"));

        String[] languages=list2.toArray(new String[0]);//list2.size()
        System.out.println(Arrays.toString(languages));

        System.out.println("----------------------------------------");


        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        Integer[]n = nums.toArray(new Integer[0]);
        System.out.println(Arrays.toString(n));


    }
}
