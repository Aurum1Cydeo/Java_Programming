package day17_customClass;

public class UniqueCharacter {
    public static void main(String[] args) {

        String str="aabcccd";
        String unique=" ";


        for (int i = 0; i<str.length(); i++){//last minus 1 "i"-index number of str
            char each=str.charAt(i);
     if(str.indexOf(each) == str.lastIndexOf(each)){
      unique+=each;

            }

        }

        System.out.println(unique);


    }
}
