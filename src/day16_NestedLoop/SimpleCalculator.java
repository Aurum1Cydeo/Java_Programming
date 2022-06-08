package day16_NestedLoop;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = "yes";
        while (answer.equals("yes")) {

            System.out.println("Enter first number: ");
            double n1 = input.nextDouble();

            System.out.println("Enter a math operator:");
            char oper = input.next().charAt(0);

            while (!(oper == '+' || oper == '-' || oper == '*' || oper == '/')) {
                System.out.println("Invalid operator, please re-enter valid operator: ");
                oper = input.next().charAt(0);//repeats until user enters right operator
            }

            System.out.println("Enter second number: ");
            double n2 = input.nextDouble();

            double result = (oper == '+') ? n1 + n2 : (oper == '-') ? n1 - n2 : (oper == '*') ? n1 * n2 : n1 / n2;
            System.out.println("result: " + result);
            System.out.println("Would you like to continue? yes/no");
            answer=input.next().toLowerCase();

            while(!(answer.equals("yes") || answer.equals("no"))){
                System.err.println("Invalid Answer! Would you like to continue? yes/no");
                answer=input.next().toLowerCase();
            }

        }
        input.close();
    }

/*1. Write a program for a simple calculator
			1.1 ask the user to enter first number: (double)
			1.2 ask the user to enter a math operator: (-, +, *, /)
				if the user enters invalid math operator, repeat the same step until user enters a valid operator

			1.3 ask the to enter the second number: (double)
			1.4 display the calculation result
			1.5 Would you like to continue? (Yes/No)

 */

}


