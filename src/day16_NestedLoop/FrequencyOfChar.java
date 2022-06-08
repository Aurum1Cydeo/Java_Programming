package day16_NestedLoop;

public class FrequencyOfChar {
    public static void main(String[] args) {

        String str ="aabbbccc";
        char ch='c';
        int count =0;
    for(int i =0;i <str.length();i++){//index number of str

    if(str.charAt(i)==ch){//if the character of the string is equal to the given character,in meants the given characetr

        count++;
    }

}
        System.out.println(count);


    }
}
/*
write a program that can return the frequency of a character from a string
Ex:
str= "aaaabbbccc"
ch='c'
output=3
 */