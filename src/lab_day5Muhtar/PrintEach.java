package lab_day5Muhtar;

import java.util.Scanner;

public class PrintEach {
    public static void main(String[] args) {

        String word =new Scanner(System.in).nextLine();
       // System.out.println(word.charAt(0));
        for(int i =0; i<word.length();i++){//or i <=word.length()-1
         char each= word.charAt(i);

            System.out.println(each);

        }



    }
}
