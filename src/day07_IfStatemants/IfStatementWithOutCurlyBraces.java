package day07_IfStatemants;

public class IfStatementWithOutCurlyBraces {
    public static void main(String[] args) {

        int age =32;
        if(age>=21){
            System.out.println("Eligible");
        }else {
            System.out.println("Not Eligible");
        }
        System.out.println("*******************************************");


        if (age >+21) System.out.println("Eligible");// only of there is one statement
        else System.out.println("Not Eligible");
        System.out.println("*********************************************");


        int itemNum = 1;

        if(itemNum ==1){
            System.out.println("Eggs");
        }




    }
}
