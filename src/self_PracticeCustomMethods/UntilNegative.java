package self_PracticeCustomMethods;

import java.util.Scanner;

public class UntilNegative {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number ");
        int number=0;
        int sum=0;
        while (number>=0){
           number = input.nextInt();
            if (number >= 0) {
                sum+=number;
                //System.out.println("number="+number+" sum "+sum);//debug
            }
        }
        System.out.println(sum);
        /*number=0, sum=0
        cycle 1: ln12 checks
        ln13 assume  user inputs number 2
        ln15 sum=2
        ln18 program goes to ln 12
        cycle 2: number=2,sum=2
        ln12 checks
        condition is true and loop continue
        ln13 assume user enters number 3
        ln14 checks if number>=0 and it's true
        ln 15 sum=2+3
        program goes to ln 12
        */
    }
}
