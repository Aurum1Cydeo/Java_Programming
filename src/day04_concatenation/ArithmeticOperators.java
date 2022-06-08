package day04_concatenation;

import jdk.swing.interop.SwingInterOpUtils;

import javax.sound.midi.Soundbank;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println(100 + 200); // 300
        System.out.println(40 - 30); //10
        //in math:
        // 20/6=3.3333...
        //in java
        // 20/6= 3 numerator and denominator

        System.out.println(50 / 6);
        System.out.println(50 / 6.0);
        System.out.println(50.0 / 6);
        System.out.println(50d / 6);
        System.out.println(50 / 6f);

        System.out.println((int) (2.5 / 0.5));
        /* Remainder in math:
        10 / 3 = 3.321

        remainder = numerator - (denominator * integer result)

        remainder = 10 - (3*3)=1

        20 / 6 = 3.3333

        20 - (6*3) =2
        15 / 4 = 3.75
        15 - (4*3) = 3

        REMAINDER IN JAVA

        10 % 3==>1
        20 % 6==>2
        15 % 4==>3
        */

        System.out.println(100 % 13);
        System.out.println(45 % 7);
    }
}
