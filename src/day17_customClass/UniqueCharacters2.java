package day17_customClass;

public class UniqueCharacters2 {
    public static void main(String[] args) {

        String str = "aabcccd";
        String unique = " ";

        for (int j = 0; j < str.length(); j++) {

            char letter = str.charAt(j);//a
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) {//how many times the letter has appeared in str
                if (str.charAt(i) == letter) //if the letter has appeared in the string
                {
                frequency++;//increase the frequency by 1
            }
        }

        if (frequency == 1) {//
            unique += letter;
        }

        }
        System.out.println(unique);
    }
}