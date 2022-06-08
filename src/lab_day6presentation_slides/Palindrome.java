package lab_day6presentation_slides;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Level"));
    }


    public static boolean isPalindrome(String str){

       return StringUtilities.reverse(str).equalsIgnoreCase(str);
    }



}
