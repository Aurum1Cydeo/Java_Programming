package day01_introToProgramming;

public class PracticePractice {
    public static void main(String[] args) {

        String word = "practice";


              for(  int i = 0; i < word.length(); i++) {

            if ((word.charAt(i) == 'a') || (word.charAt(i) == 'e') || (word.charAt(i) == 'i') ||
                    (word.charAt(i) == 'o') || (word.charAt(i) == 'u')) {

                System.out.print("" + word.charAt(i));
            }
        }
        System.out.println("----------------------");
              int[] nums={1,3,5,7,9};
        int countEven=0;
        for(int i =0; i<nums.length; i++){
            if(i%2==0){
                countEven++;
            }
        }
        System.out.println(countEven);
    }
}

