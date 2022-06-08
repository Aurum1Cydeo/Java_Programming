package day19_Arrays;

import java.util.Arrays;

public class ArrayLiteral {
    public static void main(String[] args) {

        int [] numbers = new int[5];
        int []nums={1,2,3,4,5};


        System.out.println(numbers.length);
        System.out.println(nums.length);
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
        System.out.println("------------------------weekdays---task----------------------------");
         //element:       1        2          3            4         5         6          7
        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        //  index:        0         1           2           3         4         5         6
        int n =1;
        System.out.println(days[n-1]);

        System.out.println("------------------------12 months----------------------------");
        
       String[] month={"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println("month= " + Arrays.toString(month));

        System.out.println("------------------------for loop----12 months----------------------------");

        for (int i = month.length - 1; i >= 0; i--) {
            System.out.print(month[i]+", ");

        }

        }



    }


