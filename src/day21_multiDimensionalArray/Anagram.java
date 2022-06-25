package day21_multiDimensionalArray;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
      String  str1 = "heart";
      String  str2 = "earth";
     // String[]arr1=str1.split("");
      char[] arr1=str1.toCharArray();
      char[] arr2=str2.toCharArray();

      //  System.out.println(Arrays.toString(arr1));
       // System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr1);
        Arrays.sort(arr2);
       // System.out.println(Arrays.toString(arr1));
       // System.out.println(Arrays.toString(arr2));
        boolean isAnagram=Arrays.equals(arr1,arr2);
        System.out.println("isAnagram = " + isAnagram);
        


        /*
         Write a  function that check if a string is build out of the same letters as another string. (Anagram Task)

            Ex: str1 = "heart"
                str2 = "earth"

            output:
                true

                str1 = "java"
                str2 = "python"
            output:
                false

         */




    }
}
