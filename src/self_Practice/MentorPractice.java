package self_Practice;

import java.util.Scanner;

public class MentorPractice {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array!!!");
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
        System.out.println(" ========================== ");
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE
        int originalNumber;
        int compareWithNumber;
        boolean toPrint = true;


        for (int i = 0; i < nums.length; i++) {
            originalNumber = nums[i];
            toPrint = true;

            for (int j = 0; j < nums.length; j++) {
                compareWithNumber = nums[j];

                if (originalNumber == compareWithNumber && i != j) {
                    toPrint = false;


                }

            }


        }}}