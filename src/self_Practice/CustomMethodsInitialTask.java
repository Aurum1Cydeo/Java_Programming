package self_Practice;

public class CustomMethodsInitialTask {
    public static void main(String[] args) {

maxNum(1000,5000);
initial("Nataliia","Chobu");
    }

    // create a method that can print the maximum number between two numbers,
    // if both are equal then it prints "Equal"
public static void maxNum(double num1,double num2){

        if (num1>num2){
            System.out.println(num1 + " is greater number");
        }else if (num2 > num1 ){
            System.out.println(num2 + " is greater number");
        }else {
            System.out.println("Equal");
        }



}




public static void initial(String firstname,String lastName){

        String initial = firstname.charAt(0)+"."+lastName.charAt(0);
    System.out.println("Initials are: " + initial);


}
    //creat a method  than can display the initials of a person
    /*  firstname="Cydeo";
    lastname="School";
    initial==>C.S


     */


}
