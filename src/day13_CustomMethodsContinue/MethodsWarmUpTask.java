package day13_CustomMethodsContinue;

import java.util.Scanner;

public class MethodsWarmUpTask {
    public static void main(String[] args) {
        calculate(4, 4, '*');
eligibleToVote(23, true);

    }

    public static void calculate(double num1, double num2, char mathOperator) {

        switch (mathOperator) {//what we need to define is math operator
            case '+':
                System.out.println(num1 + " " + mathOperator + " " + num2 + "=" + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " " + mathOperator + " " + num2 + "=" + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " " + mathOperator + " " + num2 + "=" + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " " + mathOperator + " " + num2 + "=" + (num1 / num2));
                break;
            default:
                System.out.println("Invalid operator: " + mathOperator);
                break;
        }

    }

    public static void ageGroup(int age) {

        if (age >= 0 && age <= 150) {
            System.out.println((age < 21) ? "Teenager" : (age < 55) ? "Adult" : "Senior");

        } else {
            System.out.println("Invalid age:" + age);
        }
    /*
    Create a method named ageGroup that can print the age group of the person

	        age groups are:
	                Teenager (< 21)
	                Adult   (>=21 && <55 )
	                Senior  ( > 55 )*/

    }

    /*Create a method named eligibleToVote that takes two arguments:
            1. age (int)
	        2. isAmerican (boolean)

    Then the method should determine if the person eligible to vote
    Ex:
    eligibleToVote(23, true)

    output:
    You are eligible to vote*/

    public static void eligibleToVote(int age , boolean isAmerican){

        if (age>=18 && isAmerican){
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }



}
