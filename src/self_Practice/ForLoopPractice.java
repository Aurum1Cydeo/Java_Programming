package self_Practice;

public class ForLoopPractice {
    public static void main(String[] args) {


        String sentence="avaJ Java Java Java is tough";
        int countJava=0;
      int  sent=sentence.length();
        System.out.println(sent);//28

        for(int i =0; i<=sentence.length()-6;i++){
           // System.out.println(sentence.charAt(i));
            System.out.println(sentence.substring(i,i+6));

        }



    }
}
