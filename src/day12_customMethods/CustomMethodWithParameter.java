package day12_customMethods;

public class CustomMethodWithParameter {
    public static void main(String[] args) {

        oddOrEven(0);
//----------------------------------------------------------------
    oddOrEven(100000);


    }

//the method takes an argument number, and verifies if the number is odd number or even number
    public static void oddOrEven(int number){

        if(number%2==0 && number !=0){
            System.out.println(number+" is Even number");
        }else if(number==0){
            System.out.println(number+" is O");
        }else{
            System.out.println(number + " is odd");
        }




    }

//create a method that can check if a person is eligible to buy alcohol

    public static void ageEligible (int age){

        if (age >=21){
            System.out.println("Eligible");
        }else{
            System.err.println("Not Eligible");
        }



    }



}
