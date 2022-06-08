package self_PracticeCustomMethods;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {

        String userInput;
        char c;
        int frequency=0;
        Scanner scan = new Scanner(System.in);

        userInput = scan.nextLine();
        c = scan.next().charAt(0);
        for(int i = 0; i<userInput.length(); i++){

            if(userInput.charAt(i)==c){
                frequency++;
            }
        }

        System.out.println(frequency);

scan.close();
    }
}
