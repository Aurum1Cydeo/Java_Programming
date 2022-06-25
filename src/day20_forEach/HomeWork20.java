package day20_forEach;
import utilities.ArraysUtility;

import java.util.Arrays;

public class HomeWork20 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        for (int i : arr1) {
            for (int j : arr2) {
               if(i==j) {//takes one element from arr1 in "i" and compares to each in "j" elem. from arr2 to the end
                   // if it matches ,prints it
                   System.out.print(i+" ");
            }
        }


/*
Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


          MUST use for each loops

 */
}

               // System.out.println("each = " + each);

            }

        }



