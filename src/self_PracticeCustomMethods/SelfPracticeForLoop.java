package self_PracticeCustomMethods;

public class SelfPracticeForLoop {
    public static void assignment1() {
        for(int i=0; i<8; i++){

            System.out.println("* * * * * *");
        }

        System.out.println();

        for (int i=0; i<48; i++) {
            System.out.print("* ");
            if (i % 6 == 5) System.out.println();
        }

        System.out.println();
    }

    public static void assignment2() {
        for(int i = 1; i<=100; i++){

            if(i%3==0 && i%5==0){
                System.out.print("FINRA ");
            }else if (i%3==0){
                System.out.print("FIN ");
            } else if (i%5==0) {
                System.out.print("RA ");
            }else{
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void assignment3() {

        int sum=0;
        int number=100;
        for (int i =1; i<=number; i++){
            sum+=i;
            System.out.println(i +" " +sum);
        }
        System.out.println(sum);
    }

    public static void assignment4() {
        int input=5;
        int result=1;
        for(int i = 1; i<=input; i++){
            result*=i;
            System.out.println(i+ " "+ result);//you could see steps of the loop
        }
        System.out.println(result);
    }

    public static void assignment5() {
        char c;
        String outputLetters = "";
        String outputDigits = "";
        String outputSpecial = "";
        String input ="wertwert123###$fffs";
//checks every character 'c' in input2 string
        for ( int i = 0; i<input.length(); i++) {
            c = input.charAt(i);//takes letter at index i
            //System.out.println(i+" "+ c);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                outputLetters += c;
            } else if (c >= '0' && c <= '9') {
                outputDigits += c;

            } else {
                outputSpecial += c;
            }

        }
        System.out.println("letters: "+outputLetters);
        System.out.println("digits: "+ outputDigits);
        System.out.println("special chars: "+outputSpecial);
    }

    public static void assignment6(){


        String input="A1B2C3";
        int sum=0;
        char c;
        for (int i = 0 ; i < input.length(); i++) {
            c = input.charAt(i);//takes letter from input string at index 'i'
            //if (c >= 48 && c<= 57)
            if(c >= '0' && c <= '9'){
                sum+= c - 48;//ascii digit '1' has code 49. to get number 1 subtract+
                //+ 48 from the character value
            }

        }
        System.out.println(sum);

    }

    public static String reverse(String str){
        String reverse = "";//to contain all the characters of the given string in reversed order

        for(int i = str.length() - 1 ; i >= 0; i-- ){//i: index of the given string starting from last index to index 0
            reverse += str.charAt(i);//to get each character of the string starting last index to index zero
        }

        return reverse;
    }

    public static void assignment7(){
        String str1 = "Level";
        String reverseStr1;
        boolean result;

        str1 = str1.toLowerCase();
        reverseStr1 = reverse(str1);

        if (str1.equals(reverseStr1)) {
            result = true;
        } else {
            result = false;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        assignment1();
        assignment2();
        assignment3();
        assignment4();
        assignment5();
        assignment6();
        assignment7();
    }
}



