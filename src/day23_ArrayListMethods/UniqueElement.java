package day23_ArrayListMethods;
import java.util.ArrayList;
import java.util.Arrays;
public class UniqueElement {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); //2
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");


        for (String each : names) {
            if (names.indexOf(each) == names.lastIndexOf(each)) {
                System.out.println(each);
                // break;
            }


        }

        System.out.println("-------------------------------------------------");
        ArrayList<String> names1 = new ArrayList<>();
        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); //2
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");
        System.out.println(  names1.indexOf("Vasyl") );
        System.out.println( names1.lastIndexOf("Vasyl") );
        System.out.println( names1.lastIndexOf("Sumeye") );


        boolean hasMuhtar = names1.contains("Muhtar"); // false
        boolean hasAli = names1.contains("Ali"); // true

        System.out.println("hasMuhtar = " + hasMuhtar);
        System.out.println("hasAli = " + hasAli);


    }
}