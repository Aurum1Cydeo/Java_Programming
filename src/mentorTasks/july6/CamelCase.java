package mentorTasks.july6;

public class CamelCase {
    public static String camelCase(String input) {


        String sentence = "";
        for (int i = 0; i < input.length(); i++) {
            String str = Character.toString(input.charAt(i));
            if (str.equals(str.toUpperCase())) {//checks each letter if it's upper case or not, if yes it adds space in front of it
                sentence += " ";
            }
            sentence += str;// creates new sentence with a space

        }

        return sentence.trim();// if input starts with the upper case it removes a space in the beginning of a new sentence
    }

    public static void main(String[] args) {
        System.out.println(camelCase("camelCase"));
        System.out.println(camelCase("JavaIsLoveableLanguage"));
        System.out.println(camelCase("weLoveProgramming"));
        System.out.println(camelCase("identifier"));
    }
}
