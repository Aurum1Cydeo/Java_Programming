package lab_day5Muhtar;

public class FrequencyOfWord3 {
    public static void main(String[] args) {

        String sentence = "JavaJavaJavaJava Python C# Ruby Java Java";
//
        int sen1 = sentence.length();//44


        int countJava = 0;
        for (int i = 0; i <= sentence.length() - 4; i++) {
            String each = sentence.substring(i, i + 4);//creating all possible substring with 4 characters


            if (each.equals("Java")) {//if the substring
                countJava++;
            }
        }

        System.out.println(countJava);

        System.out.println("-------------------------------------------");
        String s = "Cat Cat Cat Dog Dog Dog ";
        int countCat = 0;
        int countDog=0;
        for (int i = 0; i <= s.length() - 3; i++) {
            String each = s.substring(i, i + 3);//creating all possible substring with 4 characters


            if (each.equals("Cat")) {//if the substring
                countCat++;
            }
            if(each.equals("Dog")){
                countDog++;
            }
        }
        System.out.println(countCat);
        System.out.println(countDog);

    }
}
