package self_Practice;

import java.util.Scanner;

public class CalculatorTipInClass {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Split or No split?(Yes or No)");
        String yesNo = input.next().toLowerCase();//"Yes"==>yes

        System.out.println("Enter the number of people: ");
        int numberOfPeople = input.nextInt();

        System.out.println("Enter the check amount: ");
        double amount = input.nextDouble();//$100


        System.out.println("How was the service quality?( Excellent/Great/Good/Fair/Poor");
        String service= input.next().toLowerCase();

        double totalTip= (service.equals("exellent"))?amount * 0.25 //$25
                : (service.equals("great"))?amount * 0.2
                :(service.equals("good"))?amount * 0.15
                :(service.equals("fair"))?amount * 0.1
                :amount*0.5;


        double totalToPay = amount+totalTip;//$125

        System.out.println("Number of people: " + numberOfPeople);
        System.out.println("Total to pay: "+ totalToPay);
        System.out.println("Total tip: " + totalTip);

        if (yesNo.equals("yes")){
            System.out.println("Total per person: " + (totalToPay/numberOfPeople));
            System.out.println("Tip per person: "+ totalTip/numberOfPeople);
        }

        








    }
}
