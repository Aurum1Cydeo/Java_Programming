package day19_Arrays;

import java.text.DecimalFormat;

public class DecimalFormatPractice {
    public static void main(String[] args) {


        DecimalFormat df= new DecimalFormat("0.0");
        double n1=10.587654;

        System.out.println(df.format(n1));

    }
}
