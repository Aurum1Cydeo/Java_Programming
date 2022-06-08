package day06_ifStatements;

public class IfAndElseStatementIntro {
    public static void main(String[] args) {

        int age = 22;

        if (age >= 21) {
            System.out.println("Eligible");

        }
        if ( age <21){
            System.err.println("Not Eligible");
        }

        System.out.println("--------------------------------------------------------");

        if (age >= 21) {
            System.out.println("Eligible");
        } else { // otherwise
            System.err.println("Not Eligible");

    }
}
}