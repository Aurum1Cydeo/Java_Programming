package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        System.out.println("-----------ADD METHOD--------------");
        ArrayList<Integer> list=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30);

        list.add(1,15);//new element can be inserted between elements

        list.add(4,25);
        System.out.println(list);

        System.out.println("-------------get()method-----------------------");

        ArrayList<String> studentsList = new ArrayList<>();

        studentsList.add("Mohammad");
        studentsList.add("Abdurasul");
        studentsList.add("Abidulah");
        studentsList.add("Tatiana");

        System.out.println(studentsList.size());
        System.out.println(studentsList);

   String firstName= studentsList.get(0);
String lastStudent=studentsList.get(studentsList.size()-1);
        System.out.println(firstName);
        System.out.println(lastStudent);







    }

}
