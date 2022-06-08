package day06_ifStatements;

public class ifStatementsIntro {

    public static void main(String[] args) {
        int number = 3;
        //System.out.println( number + " is positive number");
        boolean isPositive = number > 0;
        if (isPositive) {
            System.out.println(number + " is positive number");
        }
        boolean isNegative = number < 0;
        if (isNegative) {
            System.out.println(number + " is negative number");
        }

        boolean isZero = number == 0;
        if (isZero) {
            System.out.println(number + " is zero");

        }
        System.out.println("---------------------------------------------------");

        int num = 100;

        if (num > 0) {
            System.out.println(num + " is positive");
        }
if (num == 0){

        System.out.println( num + " is zero");

    }
}}
