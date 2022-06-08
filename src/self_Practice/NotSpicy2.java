package self_Practice;

import java.util.Locale;
import java.util.Scanner;

public class NotSpicy2 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please, enter a word");
        String word = userInput.next();

        if(word.startsWith("x")){
            word = word.replaceFirst("x","a");
        }else{
            System.out.println("No need to change");
        }
        System.out.println(word);

        //**************************************************************************************************

        System.out.println("Please, enter a word");

        String word2 = userInput.next();
        word2 = word2.replace("X","x");
        word2 = word2.replaceAll("x","a");
        System.out.println(word2);

        //***************************************************************************************************
        System.out.println("Please, enter a word: ");

        String word3=userInput.next();

        if(word3.endsWith("ly")){
            System.out.println("really?");
        }else{
            System.out.println("never mind");
        }

        userInput.close();
    }
}
