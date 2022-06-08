package lab_day6presentation_slides;

public class StringUtilities {
   /* public static int frequency(String sentence, String word) {


      /*  int count = 0;
        for (int i = 0; i <= sentence.length() - word.length(); i++) {
            String each = sentence.substring(i, i + word.length());//creating all possible substring with 4 characters


            if (each.equals(word)) {//if the substring
                count++;
            }
        }
        return count;
    }
    */


    //return th frequency of the given word frm the sentence
    public static int frequency(String sentence, String word) {


        int count = 0;//assume that there is no "Java" ,so that's why 0
//            sentence.indexOf("Java")>=0
        while (sentence.contains(word)) {
            sentence = sentence.replaceFirst(word, "");//remove one "Java" at a time
            count++;//increase the number of java by 1
        }
        return count;


    }
    //                                   "aabacde",'a'
    public static int frequency(String str,char ch){
        int count=0;
       for (int i = 0; i<str.length();i++){
           if(str.charAt(i)==ch){
               count++;
           }
       }
       return count;

    }

    public static String reverse(String word) {

        String result = "";

        for (int i = word.length() - 1; i >= 0; i--) {//i is index number of the string(word) starting
            // from last index to 0
            char each = word.charAt(i);//character starting from last character to first character
            result += each;
        }
        return result;
    }
    public static String removeDupl(String str){

        String result="";
        for (int  i= 0;  i< str.length(); i++) {
            char each= str.charAt(i);
            //result.indexOf(each)<0
            if (!result.contains(""+ each)) {//before adding the character to the new string,
                // we check if character is not included in the string
                result += each;

            }
        }
        return result;
}
}
