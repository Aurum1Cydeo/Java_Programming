package self_Practice;

import java.util.Scanner;

public class ReplitPractice {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num= input.nextInt();
        for(int i=1; i<= 3 ; i++){
           num++;
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
