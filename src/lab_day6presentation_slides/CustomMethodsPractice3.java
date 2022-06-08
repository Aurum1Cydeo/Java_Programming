package lab_day6presentation_slides;

import java.util.Locale;

public class CustomMethodsPractice3 {

    public static void main(String[] args) {

        System.out.println(doubleChar("Cydeo"));
        System.out.println(endsLy("Friend"));
        System.out.println(hasBad("jbad"));
        System.out.println(atfirst("hir"));

    }

    //The
    public static String doubleChar(String str) {
        String result = "";//TThhee

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            result += each;
            result += each;   //""+each+each;
        }
        return result;

    }

    public static boolean endsLy(String str) {

        str = str.toLowerCase();

        return str.endsWith("ly");


    }

    public static boolean hasBad(String str) {
        if(str.equals("bad")){
            return true;
        }

        if (str.length() < 4) {
            return false;
        }

        if (str.substring(0, 3).equals("bad")) {
            return true;
        }
        if (str.substring(1, 4).equals("bad")) {
            return true;


        }
        return false;
    }

    public static String atfirst(String str){

        if(str.isEmpty()){
            return "@@";
        }else if (str.length()==1){
            return str+"@";
        }else {
            return str.substring(0,2);
        }

    }

}