package day16_NestedLoop;



public class FrequencyOfWord {
    public static void main(String[] args) {


        String sentence="Java Java Java Java ";
        String word="Java";

        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        int count= 0;

        while(sentence.contains(word)){
            count++;

            sentence = sentence.replaceFirst(word," ");

        }

        System.out.println(count);


/*
Write a program that can return the frequency of the word java from a sentence
    Ex:
        sentence = "My favorite programming language is Java, I love jAva, JAVA is so cool"

    output:
        4
        "Java Java Java Java " count=0
        " Java Java Java "count = 1
        "Java Java "count=2
        " Java "count=3
        " "count=4
 */


    }
}
