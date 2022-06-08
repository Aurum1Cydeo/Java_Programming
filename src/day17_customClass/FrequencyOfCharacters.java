package day17_customClass;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str="aaaaaaaaaaaabbbbbbbbbbbddddddddddeeeeetttttyyyyyy";

        String result="";//a2b1c3d1

        for (int j =0; j<str.length(); j++) {


            char ch = str.charAt(j);
            int frequency =0;
            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == ch) {
                    frequency++;
                }
            }
            if(result.contains(""+ch)){// convert into string by using "";if thr character is already included
                continue;//skip that character avoiding duplication of the same character
            }
            result += ch+""+frequency;

        }
        System.out.println(result);
    }
}
