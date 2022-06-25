package mentorTasks;

import java.util.ArrayList;
import java.util.Collections;

public class HighAndLow {
    public static String maxMin(String str){
       String [] arr= str.split(" ");
        ArrayList<Integer> list=new ArrayList<>();
        for (String each : arr) {
            list.add(Integer.valueOf(each));
        }
      return Collections.max(list)+" "+Collections.min(list);
    }


    public static void main(String[] args) {
        System.out.println(maxMin("1 2 3 4 5"));
    }
}
