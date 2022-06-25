package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethod {
    public static void main(String[] args) {

        System.out.println("---------replace all method ----------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java","Java","Java","C#","C#","Ruby","Swift","Java"));

        Collections.replaceAll(names,"Java","Python");

        System.out.println(names);

        System.out.println("-----------Frequency method---------------");

        ArrayList<Integer> list =new ArrayList<>();

        list.addAll(Arrays.asList(10,20,20,30,40,40,50,50,50,50,50,60,50,50,50,50));
        int count = Collections.frequency(list,50);
        System.out.println("Frequency of '50' in the list: "+count);

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java","Java","Java","C#","C#","Ruby","Swift","Java"));

        int countJava=Collections.frequency(words,"Java");
        System.out.println(countJava);

        ArrayList<Integer> numbers=new ArrayList<>();
        System.out.println("-------------------");
        numbers.addAll(Arrays.asList(10,20,20,30,40,40,50,50,50,50,50,60,50,50,50,50));

        for (Integer each : numbers) {
         if(Collections.frequency(numbers,each)==1)   {
             System.out.println(each);
         }
        }



    }
}
