package day13_CustomMethodsContinue;

import com.sun.security.auth.UnixNumericGroupPrincipal;

import java.util.Scanner;

public class ReturnStatementPractice2 {
    public static void main(String[] args) {

        int number = new Scanner(System.in).nextInt();

        if(number<1 || number>7){
            System.out.println("Invalid Number: " + number);
            return;//exit the main method
        }
        System.out.println( (number==1)?"Monday":(number==2)?"Tuesday":(number==3)?"Wednesday":(number==4)?
                "Thursday":(number==5)?"Friday":(number==6)?"Saturday":"Sunday");
        //we didn't write number==7 because of <if(number<1 || number>7)

    }

}
