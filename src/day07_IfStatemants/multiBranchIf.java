package day07_IfStatemants;

public class multiBranchIf {
    public static void main(String[] args) {

        int num= -8;
        String result="";
        if (num > 0) {
            System.out.println("Positive");
        }
        if (num < 0){
            System.err.println("Negative");
        }
        if(num == 0) {
        }   System.out.println("Zero");


        System.out.println("*************************************************************************");

        String result2 = "";


        if(num>0){
           result2="Positive" ;
        }else if(num<0){
            result2="Negative";

        }else{
            result2="Zero";
        }
        System.out.println(result2);
    }
}
