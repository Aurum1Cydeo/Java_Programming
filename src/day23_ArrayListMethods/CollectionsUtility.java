package day23_ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        System.out.println("---------------min and max methods-------------------");
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8)) ;
      int max =  Collections.max(list);//unboxing
      int min = Collections.min(list);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        
        System.out.println("---------------sort method-------------------");
        ArrayList<String> groceryList=new ArrayList<>();
        groceryList.addAll(Arrays.asList("Eggs","Potato","Milk","Tomato","Rice","Orange","Strawberry","Blueberry","Paper towels"));
        Collections.sort(groceryList);
        System.out.println("groceryList = " + groceryList);

        System.out.println("----------------sort method--------------------");
        Collections.reverse(groceryList);
        System.out.println("groceryList = " + groceryList);
        
        ArrayList<String> students=new ArrayList<>();
        
        students.addAll(Arrays.asList("Gadir","Hasan","Abidulah","BIlal"));
        System.out.println("students = " + students);
        Collections.swap(students,0,1);
        Collections.swap(students,0,students.size()-1);
        System.out.println("students = " + students);
        
        
    }
}
