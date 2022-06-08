package self_PracticeCustomMethods;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        String answer="";


        System.out.println("Will you marry me?");

        while (!(answer.equals("yes")||answer.equals("no"))) {
            answer = input.next();

            if (answer.equals("yes")) {
                System.out.println("Congrats.");
            } else if (answer.equals("no")) {
                System.out.println("Goodbye");
            } else {
                System.out.println("Invalid answer, please re-enter");
            }
        }

input.close();




    }
}
