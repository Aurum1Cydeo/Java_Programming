package self_Practice;

import java.util.Scanner;

public class MediumSpicy2 {
    public static void main(String[] args) {
        Scanner inputWord = new Scanner(System.in);
        String result;

        System.out.println("Enter first word");
        String word1 = inputWord.next();

        System.out.println("Enter second word");
        String word2 = inputWord.next();

        if(word1.endsWith(word2.substring(0,1))==true){
            result = word1 + word2.substring(1);
        }else{
            result=word1 + word2;
        }
        System.out.println(result);


inputWord.close();

    }
}
