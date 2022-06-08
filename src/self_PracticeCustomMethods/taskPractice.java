package self_PracticeCustomMethods;
import java.util.Scanner;
public class taskPractice {
    public static void main(String[] args) {
        String username = "Cydeo";
        String password = "Cydeo123";


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your username: ");
        String givenUsername = input.next();

        System.out.println("Please enter your password: ");
        String givenPassword = input.next();

        if (!(username.equals(givenUsername) && password.equals(givenPassword))) {
            for (int i = 0; i < 3; i++) {
                System.err.println("Invalid error. Please try again! ");
                System.out.println("Please enter your username: ");
                givenUsername = input.next();

                System.out.println("Please enter your password: ");
                givenPassword = input.next();

            }

        }

        if ((username.equals(givenUsername) && password.equals(givenPassword))) {
            System.out.println("Logged in!!!");
        } else {
            System.err.println("Account blocked! Try later!");
        }


    }


}


