package self_Practice;

public class CustomMethodsPractice2 {
    public static void main(String[] args) {
        OddZeroEven(0);
    }

    public static void OddZeroEven(int number ){

        if (number %2 == 0){
            System.out.println(number+" is even number");
        }if(number % 2 != 0){
            System.out.println(number+" is odd");
        }else{
            System.out.println(number + " is zero");
        }




    }




}
