package lab_day6presentation_slides;


import java.util.Locale;

public class CustomMethodsPractice2 {


    public static void main(String[] args) {
       String result1= comboString("Hello","World");
        System.out.println(result1);
        System.out.println("--------------------------");
        System.out.println(left2("Java"));
        System.out.println(right2("HelloJava"));

    }



    public static String comboString(String a,String b){
        if(a.length()>b.length()){
            return b+a+b;
        }else if(b.length()>a.length()){
            return a+b+a;
        }else {
            return a+b;
        }

    }

    public static String left2(String str){
        if(str.length()<3){
            return str;
        }
        String s1=str.substring(0,2);//"He"
        String s2=str.substring(2);//"llo" we don't have to provide ending index
        return s2+s1;//lloHe
    }

    public static String right2(String str) {
        //"HelloJava"
        if (str.length() < 3) {
            return str;
        }
        String s1 = str.substring(str.length() - 2);//"-lo"// "HelloJa - "va"
        // "-2" distracts  last 2 characters)
        String s2 = str.substring(0, str.length() - 2);//"Hel"-//"HelloJa"
        return s1 + s2;//"va"+"HelloJa" = vaHelloJa


    }

    public static boolean frontAgain(String str){

        if(str.length()<2) {
            return false;
        }
        String firstTwoChars=str.substring(0,2);
        String lastTwoChars=str.substring(str.length()-2);
        return firstTwoChars.equals(lastTwoChars);
        //return=
    }

    public static int countHi(String str){

        return  StringUtilities.frequency(str, "Hi");


}

    public static boolean catDog(String str){
        str=str.toLowerCase();
      int countCat = StringUtilities.frequency(str,"cat");
      int countDog=StringUtilities.frequency(str,"dog");
      return countDog==countCat;


}

}
