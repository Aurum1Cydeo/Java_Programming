package self_Practice;

public class PairedLetters {
    public static void main(String[] args) {
        String word = "console";

          for (char i ='A'; i<='E'; i++){
       // for (int i = 0; i < word.length(); i++) {

            for (char j = 'a'; j <= 'y'; j++) {

                System.out.print("\t" + i + j);

            }
            System.out.println();
        }

    }
}