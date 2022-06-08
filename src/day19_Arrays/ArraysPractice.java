package day19_Arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        String[] myGroup = new String[5];

        myGroup[0]="Dilara";
        myGroup[myGroup.length-1]="Burulai";
        myGroup[2]="Sumeya";//the same
       // myGroup[myGroup.length-3]="Sumeya";
        myGroup[1]="Qadir";
        myGroup[3]="Julia";
        myGroup[1]="Kuzzat";
        System.out.println(Arrays.toString(myGroup));
        System.out.println("-----------------------------------------");

        for (int i = myGroup.length-1; i >=0 ; i--) {
            System.out.println(myGroup[i]);

        }
        for (int i = 0; i < myGroup.length; i++) {

        }

        for (int i = myGroup.length - 1; i >= 0; i--) {
            System.out.println("Arrays= " + Arrays.toString(myGroup));
        }

    }
}
