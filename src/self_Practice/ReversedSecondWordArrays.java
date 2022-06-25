package self_Practice;

import utilities.StringUtility;

public class ReversedSecondWordArrays {
    public static void main(String[] args) {



        String sentence = "I Love Java";

        String[] arr = sentence.split(" ");

       arr[1] = StringUtility.reverse(arr[1]);

        for (String each : arr) {
            System.out.print(each+" ");
        }








    }
}
