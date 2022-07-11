package arrayPracticeTasks;

public class InsertTask {
    public static void main(String[] args) {

        String str = "abcdeba";

        int repeats = 0;
        for (int i = 0; i < str.length() ; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    repeats++;


                }

            }
            System.out.println("repeats = " + repeats);

        }
    }}
