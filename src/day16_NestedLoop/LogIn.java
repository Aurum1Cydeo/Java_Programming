package day16_NestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String u,p;
        int attempts=3;
        do {
            System.out.println("Enter your user name");
            u=input.next();

            System.out.println("Enter your password");
            p=input.next();
            attempts--;
            if(attempts==0){
                System.out.println("Your account is locked");
                break;
            }


        }while(!(u.equals("Cydeo")&&p.equals("WoodenSpoon")));//while credentials are invalid
       if(attempts>0){

           System.out.println("You are logged in");
       }
    }
}
