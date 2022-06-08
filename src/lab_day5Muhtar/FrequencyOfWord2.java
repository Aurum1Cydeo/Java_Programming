package lab_day5Muhtar;

public class FrequencyOfWord2 {
    public static void main(String[] args) {

      String sentence= "Java Java Java Java Python C# Ruby Java Java";

      int countJava=0;//assume that there is no "Java" ,so that's why 0
//            sentence.indexOf("Java")>=0
        while(sentence.contains("Java")){
            sentence=sentence.replaceFirst("Java","");//remove one "Java" at a time
            countJava++;//increase the number of java by 1
        }
        System.out.println(countJava);





    }
}
