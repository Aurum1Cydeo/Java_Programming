package mentorTasks;
import java.util.Scanner;

public class Mentor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = input.next();
        System.out.println(findDup(str));    }

    public static String findDup(String str) {
        String[] ch = str.split("");//aaa bb cc
        String newString = "";

        for (String each : ch) { //a a a bb cc
            int counter = 0;
            for (String result : ch) {//a a a bb cc
                if ( result.equalsIgnoreCase(each) ) {
                    counter++;//a1 a2 a3

                }
            }
            if ( counter > 1 && !(newString.toLowerCase().contains(each.toLowerCase()) )) {

                newString += each;//a1 /b /c
            }
        }
        System.out.println("number of duplicate = "+newString.length());        return newString;
    }
    }

