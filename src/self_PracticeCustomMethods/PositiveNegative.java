package self_PracticeCustomMethods;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);

        int positiveNumber = 0;
        int negativeNumber = 0;
for(int i = 0; i<5; i++){
    number = input.nextInt();
    if(number>0){
        positiveNumber++;
    }else if (number<0){
        negativeNumber++;
    }

}
        System.out.println(positiveNumber + " positive and "+ negativeNumber +" negative");

input.close();
    }
}
