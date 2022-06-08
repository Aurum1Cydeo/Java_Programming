package self_Practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NotSpicy {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter website name");
        String websiteName=input.nextLine();

        boolean isValid = websiteName.startsWith("www.") && websiteName.endsWith(".com")
                ||websiteName.endsWith(".edu")||websiteName.endsWith(".gov");
        if (isValid){
            System.out.println("Valid website");
        }else{
            System.out.println("Invalid website");
        }
input.close();
    }
}
