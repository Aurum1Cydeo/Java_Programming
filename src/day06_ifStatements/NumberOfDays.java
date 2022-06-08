package day06_ifStatements;

public class NumberOfDays {

    public static void main(String[] args) {
        int n = 7;
        boolean has28Days = n ==2;
        boolean has30Days = n == 4 || n ==6 || n == 9 || n== 11;
        boolean has31Days = !has28Days && !has30Days;
        // if the month does not have 28 days, and also doesn't have 30 days, then the month has 32 days

        String result = "";
        if (has28Days){
            result = "28 days";
        }
        if (has30Days){
            result = "30 days";
        }
        if (has31Days){
            result = "31 days";
        }
        System.out.println(result);






    }
}
