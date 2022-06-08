package day15_whileLoop;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        while(! (age>=1 && age >150)) {//opposite of eligible age
            System.out.println("Invalid entry! Re-enter your age: ");

            age = input.nextInt();
        }
            if(age >=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible ");
        }


        input.close();

    }
}
