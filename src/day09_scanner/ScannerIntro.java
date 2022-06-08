package day09_scanner;

import java.util.Scanner; //imports particular class

        //import java.util.*;    //wild imports all package

public class ScannerIntro {

    public static void main(String[] args) {

       // Scanner input = new Scanner(System.in);// for reading user inputs

        Scanner input = new Scanner(System.in);
        // input.close () to finish
        System.out.println("Enter your first number: ");

        byte num1 = input.nextByte();

        System.out.println("Enter your second number: ");

        short num2 = input.nextShort();

        System.out.println("Enter your third number: ");

        int num3 = input.nextInt();

        System.out.println("Enter you fourth number: ");

        long num4 = input.nextLong();
        input.close();//scanner is closed, cannot read user inputs again

        System.out.println("You entered : "+ num1);
        System.out.println("Enter your second number: "+ num2);
        System.out.println("Enter your third number: " + num3);
        System.out.println("Enter you fourth number: "+ num4);






    }

}
