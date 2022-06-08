package day03_variables;

public class VariableNamingRules {
    public static void main(String[] args) {

        //  age of the student is 28
        //salary is 10000
        int age = 28;
        int salary = 10000;

        //int age = 32 ; it gives error because Variable name must be uniq
        // "age" is already taken by "28"

        int phoneNumber = 123456789; // camel case
        double salaryBeforeTax = 100000; // use camel cases in each word in variable after first word

        double salary_after_tax$ = 80000.5;
         /* variable naming rules:
         VARIABLE NAMES PREFERRED TO START WITH LOWER CASE
         1.readable, understandable, and meaningful
         2.must be unique
         3.use second word in variable names CAMEL CASE
         4.cannot use other symbols other than _ and $
         5.cannot start with digits
         6.variable names can not be reserved words
        */

        /* STRING stores text
        String gender = male

         */
        System.out.println();

    }
}
