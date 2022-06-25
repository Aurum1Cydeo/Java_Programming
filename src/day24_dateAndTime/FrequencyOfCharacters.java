package day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {


        String str="aaabbbdddd";
        String result="";//a3b3d4 we need to transfer to array
// we need to convert array into Collection type add "Arrays.asList()"
        for (String each : str.split("")) {//Collections converter Arrays.asList()
          int frequency=  Collections.frequency(Arrays.asList(str.split("")),each);
               if(!result.contains(each)) {
                   result+=each+frequency;
               }
            }
        System.out.println(result);
        }



    }

