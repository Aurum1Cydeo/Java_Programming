package self_Practice;

import java.util.Scanner;

public class MediumSpicy {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("User, enter first word ;) ");
        String firstWord = input.next();

        System.out.println("User, enter second word :D ");
        String secondWord = input.next();

        String result1 = firstWord.substring(0+1);
        String result2 = secondWord.substring(0+1);

        System.out.println(result1+result2);

        //*********************************************************************
input.close();



    }
}
