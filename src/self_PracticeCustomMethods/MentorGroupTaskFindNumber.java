package self_PracticeCustomMethods;

import java.util.Scanner;

public class MentorGroupTaskFindNumber {
    public static void main(String[] args) {
        int targetNumber = (int)(100*Math.random());

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your guess (1~100) :  ");
        int number = input.nextInt();

        while (number != targetNumber) {
            if (number > 100 || number < 1) {
                System.err.println("your number is out of range, please try again.");
            } else {
                if (number > targetNumber) {
                    System.out.println("your number is bigger than target number.");
                } else {
                    System.out.println("your number is smaller than target number.");
                }
                System.err.println("Your guess is Not correct, please guess another number.");
            }
            number = input.nextInt();

        }
        System.out.println("Good job.");
input.close();
       }

    }

/*
You’re asked to code a game. The user is asked to find a number between 1 and 100.
When the user enters a number there will be a message that mentions whether
the estimated number is greater or less than the target number,
until the user finds the target number. You cannot leave the game, once started.
 */