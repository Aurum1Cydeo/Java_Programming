package day13_CustomMethodsContinue;

public class ReturnStatement {

    public static void main(String[] args) {
        eligible(25);
        System.out.println("-----------------------------------");

        System.out.println("Test Started");
        boolean exit=true;
        if(exit){
            return;//main method gets terminated
        }

        System.out.println("Test1 ");
        System.out.println("Test2 started ");
    }

    public static void eligible(int age){
        if(age< 0 || age>150){
            System.err.println("Invalid age: "+age);
            return;//exits the method
            //if the age is invalid,then this method gets terminated
        }
        if(age>=21){
            System.out.println("Your are eligible to buy alcohol");
        }else{
            System.out.println("Your are not eligible to buy alcohol");
        }
    }

    public static int multiplication(int n1,int n2){

        int result = n1*n2;
        return result;//returns the value

    }





}
