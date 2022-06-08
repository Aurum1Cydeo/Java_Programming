package lab_day5Muhtar;

public class FrequencyOfWord {
    public static void main(String[] args) {

        /*
        String sentence= "Java Java Java Java Python C# Ruby";


        int original_length=sentence.length();

        String temp=sentence;//"Java Java Java Java Python C# Ruby"

        temp=temp .replace("Java","aaa");
        int new_length= temp.length();

        System.out.println(original_length);
        System.out.println(new_length);

        int frequencyOfJava=original_length-new_length;
        System.out.println(frequencyOfJava);
 */

        String sentence= "java java java java  Python C# Ruby";
        String temp= sentence.toLowerCase().replace("java","abc");
        int frequencyOfJava=sentence.length()-temp.length();
        System.out.println(frequencyOfJava);
        String sentence1=sentence;





    }
}
