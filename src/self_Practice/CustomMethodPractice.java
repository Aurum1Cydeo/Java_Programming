package self_Practice;

public class CustomMethodPractice {
    public static void main(String[] args) {

isEligible(117);
    }

    //create a method that can check if a person is eligible to buy alcohol

    public static void isEligible(int age) {

        if (age >= 21 && age<=100) {
            System.out.println("Eligible");
        } else {
            System.err.println("Not Eligible");
        }


    }
}