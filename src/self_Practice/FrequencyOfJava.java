package self_Practice;

public class FrequencyOfJava {
    public static void main(String[] args) {

        String x = "java";
        String word = "";
        String sentence = "My favorite programming language is Java, I love jAva, JAVA is so cool";
        int c = 0;


        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch != ' ') {
                word = word + ch;
            } else {
                if (word.equalsIgnoreCase(x)) {
                }
                c++;
            }
            word = " ";
        }
        System.out.println(x + "  frequency =  " + c+ " times");
    }
}