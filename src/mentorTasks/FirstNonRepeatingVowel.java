package mentorTasks;

import utilities.StringUtility;

import java.util.Scanner;

public class FirstNonRepeatingVowel {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        System.out.println(findUniqueVowel(str));

        System.out.println(StringUtility.reverse("diaper"));


    }



    public static int findUniqueVowel(String str) {
        for (int i = 0; i < str.length(); i++) {
            int result = 0;

            if ((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') ||
                    (str.charAt(i) == 'o') || (str.charAt(i) == 'u')) {

                for (int j = 0; j < str.length(); j++) {//a checking trough whole string
                    //                          o
                    if (str.charAt(i) == str.charAt(j)) {
                        result++;//1
                    }
                }
            }
            if (result == 1) {
               return i;
            }
        }

return -1;//str.indexOf(i)
    }

}

