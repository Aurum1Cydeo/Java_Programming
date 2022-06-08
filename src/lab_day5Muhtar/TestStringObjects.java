package lab_day5Muhtar;

public class TestStringObjects {
    public static void main(String[] args) {

        String str1= new String("Java");//string literal"Java"//"new String" is located in the heap

        String str2="Java";//str2 is located in stack but string literal is located in the pool

        String str3= new String("Java");//new keyword

        String str4="Java";

        System.out.println(str1==str3);//false
        System.out.println(str2==str4);//true
        System.out.println(str1.equals(str3));



    }
}
