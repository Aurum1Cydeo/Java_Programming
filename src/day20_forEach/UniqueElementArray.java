package day20_forEach;

public class UniqueElementArray {
    public static void main(String[] args) {
        /*5. Write a program that can display the unique elements of an array
MUST use for each loops
        */


        int[] nums = {2, 4, 5, 2, 3, 4, 5, 6, 7};

        for (int i : nums) {//2
            int count = 0;
            for (int j : nums) {//2,4,5,2,3,4,5,6,7
                if (i == j) {
                    count++;//two matches of 2
                }
            }
            if(count==1){//2!=1, so "2" is  not uniques goes on until finds what elem. count==1 and then prints
                System.out.println("Unique " + i);
            }


        }
    }
}