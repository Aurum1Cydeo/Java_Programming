package day16_NestedLoop;

import java.util.Scanner;

public class CydeoLogin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String userName=input.next();

        System.out.println("Enter your password: ");
        String password=input.next();

        if(userName.equals("Cydeo")&&password.equals("WoodenSpoon")) {//if the credentials are correct
            System.out.println("Logged in");
        }else{//otherwise
            for (int i=0; i <3;i++){
              // if(i!=2) {
                //    System.err.println("Incorrect username or password,please re-enter");
               // }else{
                //    System.err.println("This is your last chance. Please re-enter your username and password");
               // }
                System.out.println("Enter your password: ");
                userName = input.next();

                System.out.println("Enter your password: ");
                password=input.next();

                if(userName.equals("Cydeo")&&password.equals("WoodenSpoon")){//if the users enters valid credentials
                    System.out.println("You are now logged in");
                    break;//exits the loop


                }


            }

if(!(userName.equals("Cydeo")&&password.equals("WoodenSpoon"))){//after all three attempts,
    // if the username&password are still incorrect
    System.err.println("Your account now is locked,please contact support team");
}

    }
        input.close();
}

public static void cydeoLogin(String username,String password){
        if (username.equals("Cydeo")&&password.equals("WoodenSpoon")){
            System.out.println("Logged in");
        }else{

        }
}


}
