package self_Practice;

public class QadirTask2 {
    public static void main(String[] args) {
        String inputStr = "ab251df98alm4563456245nhhgvugv8768768980jhbj";
        String outputStr = "";

        // In this variable 'tmp' we will store temporary string that
        // will only contain reversed number sequence
        String tmp = "";
        char c;

        // Go through every character of the input string
        for (int i = 0; i < inputStr.length(); i++) {
            // Get the character at index 'i'
            c = inputStr.charAt(i);

            // Is the character a digit?
            if (c >= '0' && c <= '9') {
                // It is a digit, add that digit to the front of tmp string
                // that reverses it!!!
                // so if input characters were '1', '2', '3' then we start adding
                // to front so tmp first is empty ""
                // then tmp becomes tmp = '1' + "" = "1";
                // next tmp = '2' + tmp = '2' + "1" = "21";
                // next tmp = '3' + tmp = '3' + "21" = "321";
                // So you see tmp ends up with reversed number string
                tmp = c + tmp;
            } else {
                /*
                 Current character is not a digit!
                 in this case, we add whatever we already reversed in tmp
                  we clear tmp, so that next numbers are reversed again
                */
                outputStr += tmp;
                tmp = "";

                // Here variable c contains not a digit
                outputStr += c;
            }
        }

        // Here we add reversed numbers last time to make sure we add them
        // if numbers were at the end of the string
        outputStr += tmp;

        System.out.println(outputStr);
    }
}
