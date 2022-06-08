package lab_day6presentation_slides;

public class CustomMethodsPractice {
    public static void main(String[] args) {

       String result = helloName("Natalie");
        System.out.println(result);

        System.out.println(makeAbba("hi","bye"));
        System.out.println("--------------------------------");
        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("HI"));
        System.out.println("----------------------------------");
        System.out.println(firstTwo("Hello"));
        System.out.println(firstTwo("a"));
        System.out.println(withoutEnd("Hello"));
        System.out.println(withoutEnd("School"));
    }



    public static String helloName(String name){
        String result="Hello "+name+"!";
        return result;
    }
    public static String makeAbba(String a, String b){

        String result="";
        result=a+b+b+a;
       // result+=a;another option
       // result+=b;
       // result+=b;
       // result+=a;
        return result;

}
    public static String extraEnd(String str){
        if(str.length()<2){
            return str;
        }
        String substring=str.substring(str.length()-2);//last two characters of the given string
        String result = substring.repeat(3);
        return result;
//String substring=str.substring(str.length()-2).repeat(3);
}


    public static String firstTwo(String str){
       /* if(str.length()<2){
            return str;
        }
       return ""+ str.charAt(0)+str.charAt(1);
        */
        if(str.length()>=2){
            return str.substring(0,2);

            } else{
            return str;
        }


}

    public static String withoutEnd(String str ){
//                            School
        if(str.length()>=3){
           return str.substring(1,str.length()-1);//Please, explain me
        }else{
            return str;
        }
    }





}
