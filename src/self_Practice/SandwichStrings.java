package self_Practice;

public class SandwichStrings {
    public static void main(String[] args) {

String str= "breadjambread";
str=str.substring(str.indexOf("bread"),str.lastIndexOf("bread"));
        System.out.println(str);

        /*
        breadjambread

        xxbreadjambreadyy


        Use String methods and if statements to find what is inside of the sandwich.
         A sandwich is two pieces of bread with something between them.
         We want to see what is between our bread pieces. There will have only one input str.
         Inside of the str String we will look for the first occurrence of the text 'bread'
         and the last occurrence of the text 'bread'.
         Using those two points we will pull out the text between them.
         */
    }
}
