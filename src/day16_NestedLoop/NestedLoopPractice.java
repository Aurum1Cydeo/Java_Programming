package day16_NestedLoop;

public class NestedLoopPractice {
    public static void main(String[] args) {

        String str="aaaabbcccccddeeeff";

        String result ="";//bdf repeats 2 times

        for(int j = 0; j <str.length() ;j++ ) {

            char ch = str.charAt(j);//each character of str
            int count = 0;//represents frequency
            for (int i = 0; i < str.length(); i++) {//responsible for comparing ch to each character of
                // str and return of ch

                if (str.charAt(i) == ch) {
                    count++;
                }
            }

            if(count==2 && !result.contains(""+ch)){//avoid duplication
                result += ch;
            }
        }

        System.out.println(result);


    }
}
