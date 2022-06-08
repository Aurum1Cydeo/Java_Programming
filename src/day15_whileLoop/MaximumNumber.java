package day15_whileLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //Write a program that can ask the user to enter a number for 5 times and returns the maximum number

        int max =-2147483648;//10 becomes greater the -2147483648


  for(int i = 0; i <5; i++)  {//i++ iteration to make condition falls to prevent infinite loop
      System.out.println("Enter a number: ");
      int num = input.nextInt();//from user: -25,35,15,40,0
if(num>max){//if the user entered entry i greater than the current maximum number that we have
    max=num;//then user entered number should be the maximum number
}
  }

  System.out.println("Maximum number = "+max);


input.close();



    }

}
