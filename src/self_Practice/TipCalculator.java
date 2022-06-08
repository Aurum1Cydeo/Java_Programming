package self_Practice;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String isSplit;
        int numPeople;
        double checkAmount;
        String servQuality;

        System.out.println("Split or No split");
        isSplit=input.next();

        System.out.println(" Enter the number of people");
        numPeople=input.nextInt();

        System.out.println("Enter the check amount:");
        checkAmount=input.nextDouble();
        input.nextLine();

        System.out.println("How was the service quality?");
        servQuality=input.next();
        double tipPercent=0;
        double totalTip=0;
        double totalPerPerson=0;
        double totalTipPerPerson=0;

        if(servQuality.equalsIgnoreCase("poor")){
            tipPercent=0.05;
            totalTip=checkAmount+checkAmount*tipPercent;
            totalPerPerson=checkAmount/numPeople;
            totalTipPerPerson=totalPerPerson/numPeople;
        }else if (servQuality.equalsIgnoreCase("fair")){
           tipPercent=0.1;
            totalTip=checkAmount+checkAmount*tipPercent;
            totalPerPerson=checkAmount/numPeople;
            totalTipPerPerson=totalPerPerson/numPeople;
        }else if (servQuality.equalsIgnoreCase("Good")) {
            tipPercent = 0.15;
            totalTip=checkAmount+checkAmount*tipPercent;
            totalPerPerson=checkAmount/numPeople;
            totalTipPerPerson=totalPerPerson/numPeople;
        }else if (servQuality.equalsIgnoreCase("Great")){
            tipPercent=0.20;
            totalTip=checkAmount+checkAmount*tipPercent;
            totalPerPerson=checkAmount/numPeople;
            totalTipPerPerson=totalPerPerson/numPeople;
        }else if(servQuality.equalsIgnoreCase("Excelent")){
            tipPercent=0.25;
            totalTip=checkAmount+checkAmount*tipPercent;
            totalPerPerson=checkAmount/numPeople;
            totalTipPerPerson=totalPerPerson/numPeople;
        }


if(isSplit.equalsIgnoreCase("yes")){

}







        /*1. Create a class called TipCalculator, and write a program for a tip calculator.
    There will be different service quality benchmarks that will determine the tip given.
    There will also the ability to calculate based on the number of people in the party and
    if there is a split of the bill or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:
            - Split or No split (Yes or No),
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)

    And then it should display:
             Number of people entered
             Total to pay
             Total tip
             Total per person
             Tip per person:

    Ex:
        Split or No split (Yes or No)?
        YeS
        Enter the number of people
        4
        Enter the check amount:
        476
        How was the service quality? (Excellent/Great/Good/Fair/Poor)
        ExCElLeNt

        output:
            Number of people entered: 4
            Total to pay: 595.0
            Total tip: 119.0
            Total per person: 148.75
            Tip per person: 29.75*/






    }
}
