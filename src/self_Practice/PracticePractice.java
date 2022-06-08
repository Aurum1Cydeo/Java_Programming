package self_Practice;

import java.util.Scanner;

public class PracticePractice {
    public static void main(String[] args) {


        String str = "AAABBCCCCDDDDD";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;

                }
            }
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i) + "" + count;
            }
        }
        System.out.println(result);

        System.out.println("______________________________________________");


                for (char i = 'A'; i <= 'E'; i++) {

                    for (char j = 'a'; j <= 'z'; j++) {
                        System.out.print("\t" + i + j);
                    }

                    System.out.println();

                }

            String result0 = "";
            String result1 = "";

            for (int i = 1; i <= 20; i++) {

                if (i % 2 == 0) {
                    result0 = result + i + " ";
                }
            }
                for (int j = 1; j <= 20; j++) {
                    if (j % 2 != 0) {
                        result1 = result1 + j + " ";
                    }
                }
                System.out.println(result0.trim() + "\n" + result1.trim());
            }
        }






