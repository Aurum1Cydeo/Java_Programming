package self_Practice;

import java.util.Scanner;

public class CydeoApplication_NeedSolution {
    public static void main(String[] args) {

        String username = "Cydeo";
        String password = "Cydeo123";
        int numAttempts=3;

        System.out.println("Please enter your password and username");
        Scanner input= new Scanner(System.in);

        String inputUsername="";
        String inputPassword="";

       for (int i = 0; i<3; i++){
            System.out.println("Enter username: ");
            inputUsername = input.next();
            System.out.println("Enter password: ");
            inputPassword = input.next();

            if((inputUsername.equals("Cydeo") && inputPassword.equals("Cydeo123"))) {
               System.out.println("Logged in");
               break;

           }else {
           }
                   System.out.println("Your account is locked");
               }

input.close();

        }
        }









