package day20_forEach;

import utilities.StringUtility;

public class ReverseArrayHomeTask {
    public static void main(String[] args) {
        String[] arr = {"anna", "level", "Java"};

        int count = 0;
        for (String s : arr) {//"anna", "level", "Java"}
            /* if(s.equalsIgnoreCase(StringUtility.reverse(s)))//s=anna ====>reverse (s)
           count++;
       */
            String reverse = StringUtility.reverse(s);
            if (s.equalsIgnoreCase(reverse)) {
                count++;
            }

        }
        System.out.println(count);
    }
}
