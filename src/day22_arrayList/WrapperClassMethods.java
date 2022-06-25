package day22_arrayList;

import java.util.concurrent.Callable;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str="20";
        System.out.println(str+1);
     // Integer num1= Integer.parseInt(str);//unboxing
       int num= Integer.parseInt(str);//
        System.out.println(num+1);

        Integer num2 = Integer.valueOf(str);
        System.out.println(num2);
        System.out.println("----------------------------------");

        String s="20.5";
        double num3=Double.parseDouble(s);
        Double num4=Double.valueOf(s);

        System.out.println(num3);
        System.out.println(num4);

        System.out.println("-------------------------");

        String x="true";

        boolean r1= Boolean.parseBoolean(x);

        Boolean r2= Boolean.valueOf(x);
        System.out.println(r1);
        System.out.println(r2);
        
        System.out.println("-----------isDigit() method--------------");
        char ch='1';


        boolean isDigit= Character.isDigit(ch);

        System.out.println("isDigit = " + isDigit);
        System.out.println("----------isLetter()---------------");

        char ch1='A';


        boolean isLetter= Character.isLetter(ch1);
        boolean isLowerCaseLetter=Character.isLowerCase(ch1);
        boolean isUpperCaseLetter=Character.isUpperCase(ch1);

        System.out.println("isLetter = " + isLetter);
        System.out.println("isLowerCaseLetter = " + isLowerCaseLetter);
        System.out.println("isUpperCaseLetter = " + isUpperCaseLetter);


        char ch2='@';
        boolean isSpChart=!Character.isLetterOrDigit(ch2);

        System.out.println("isSpChart = " + isSpChart);
        System.out.println("-------------------------------------------");
        
        
        String str1="a1b2c3d4e5";
        int sum=0;

        for (char each : str1.toCharArray()) {
            if(Character.isDigit(each)){
              sum+= Integer.parseInt(""+each);//converts numbers from ASCII table value to its digit meaning
            }
        }
        System.out.println("sum = " + sum);
        

    }
}
