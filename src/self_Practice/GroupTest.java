package self_Practice;

import javax.sound.midi.Soundbank;
import java.util.Locale;

public class GroupTest {
    public static void main(String[] args) {

        String newWord= "sometHIng";
      char firstCharacter = ' ' ;
        firstCharacter= newWord.toUpperCase().charAt(0);
        String restOfWord = newWord.substring(1).toLowerCase();
        newWord=firstCharacter+restOfWord;


        System.out.println(newWord);







    }
}
