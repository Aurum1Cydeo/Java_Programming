package lab_day2;

import java.util.Scanner;

public class FindYourBestDeal {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int itemPrice = 5;

        //int itemCount = 5;//>=5remove this one

        System.out.println("Please select the deal you would like use");
        int dealId = scanner.nextInt();

        System.out.println("Please enter item count you would like to buy: ");
        int count = scanner.nextInt();//keep this one

        int customerCartTotal = itemPrice * count;//count change


        double amountWithSelectedDeal = 0;
        // deal1 calculations
        double amountWithDeal1 = (count>3)? customerCartTotal-customerCartTotal * 0.1:customerCartTotal;

        // deal2 calculations
        double amountWithDeal2 = (count>3)?customerCartTotal - 5:customerCartTotal;
        // deal3 calculations
        double amountWithDeal3 = (customerCartTotal>30)?(customerCartTotal-customerCartTotal * 0.15):customerCartTotal ;
        double amountWithAdvisedDeal = amountWithDeal1;
        int advisedDealId = 1;
        if (dealId == 1) {
            amountWithSelectedDeal = amountWithDeal1;
        } else if (dealId == 2) {
            amountWithSelectedDeal = amountWithDeal2;
        } else {
            amountWithSelectedDeal = amountWithDeal3;
        }

        if (amountWithDeal2 < amountWithDeal1 && amountWithDeal2 < amountWithDeal3){
            amountWithAdvisedDeal=amountWithDeal2;
            advisedDealId = 2;
        }else if (amountWithDeal3 < amountWithDeal1 && amountWithDeal3 < amountWithDeal2){
            amountWithAdvisedDeal = amountWithDeal3;
            advisedDealId = 3;
        }


        /* if ((amountWithDeal1 < amountWithDeal2)) {
            if ((amountWithDeal2 < amountWithDeal3)) {
                advisedDealId = 1;
                amountWithAdvisedDeal = amountWithDeal1;
            } else {
                advisedDealId = 1;
                amountWithAdvisedDeal = amountWithDeal2;
            }
        } else if (amountWithDeal2 < amountWithDeal3) {
            advisedDealId = 2;
            amountWithAdvisedDeal = amountWithDeal3;
        }
*/
        if (dealId == advisedDealId) {
            System.out.println("You have made excellent choice");
            System.out.println("Your cart without discount: " + count * itemPrice);
            System.out.println("Your cart with discount: " + amountWithAdvisedDeal);
        } else {
            System.out.println("There is an another deal option for you. dealId: " + advisedDealId);
            System.out.println("If you still would like to use dealId: " + dealId + " price will be " + amountWithSelectedDeal);
            System.out.println("If you use our advice  dealId: " + advisedDealId + " price will be " + amountWithAdvisedDeal);
            System.out.println("Amount deal 3: "+amountWithDeal3);
        }
    }
}