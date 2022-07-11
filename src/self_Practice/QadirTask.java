package self_Practice;

public class QadirTask {
    public static void main(String[] args) {
        String inputStr = "ab251df98alm4563456245nhhgvugv8768768980jhbj";
        String outputStr = "";
        String tmp = "";
        char c;

        // Go through every character of the input string
        for (int i = 0; i < inputStr.length(); i++) {

            c = inputStr.charAt(i);
            if (c >= '0' && c <= '9') {
                // If it's a digit, we add that digit to the front of tmp string
                // that reverses it
                tmp = c + tmp;
            } else {
                outputStr += tmp;
                tmp = "";

                outputStr += c;
            }
        }
        outputStr += tmp;

        System.out.println(outputStr);
    }
}
