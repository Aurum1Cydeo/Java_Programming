package day09_scanner;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class NextLineMethodPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");//
        String full_name = input.nextLine();

        System.out.println("Enter your school name :" );
        String school_name = input.nextLine();

        System.out.println("Enter your gender");
        String gender = input.next();// Male

        System.out.println("Enter your age: ");
        int age = input.nextInt();//28 + Enter

        input.nextLine();

        System.out.println("Enter your street name: ");
        String street = input.nextLine();



    }
}
