package day36_polymorphism;

import day30_inheritance.phoneTask.IPhone;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day30_inheritance.phoneTask.Samsung;

public class PolymorphismPractice {
    public static void main(String[] args) {


        Phone[] phones = {
                        new IPhone("Iphone 11 Pro", "Large", "Black", 900),
                        new IPhone("Iphone 12 Pro Max", "Large", "Black", 1200),
                        new IPhone("Iphone 9", "Medium", "Gold", 800),
                        new Samsung("Galaxy S19", "Medium", "Pink", 700),
                        new Samsung("Galaxy S20", "Large", "Silver", 850),
                        new Samsung("Galaxy S21", "Large", "Black", 950),
                        new Nokia("XR20", "Small", "White", 350),
                        new Nokia("G10", "Medium", "Black", 99),
                        new Nokia("G50", "Large", "Silver", 250),
                        new IPhone("Iphone 12 Pro", "Large", "Black", 1200),
                        new IPhone("Iphone 11 Pro Max", "Large", "Silver", 1100),
                        new Samsung("Galaxy S18", "Medium", "White", 750),
                        new Samsung("Galaxy S17", "Large", "Silver", 650),
                        new Nokia("G10", "Medium", "Black", 99),
                        new IPhone("Iphone 6", "Small", "Gold", 400),
                        new IPhone("Iphone 7", "Small", "White", 500)
                };

       for( Phone eachPhone :phones){
           System.out.println(eachPhone.getModel()+" - "+eachPhone.getColor()+" - $"+eachPhone.getPrice());
       }

        System.out.println("----------------------------");

       int countIphone=0;
       int countNokia=0;
       int countSamsung=0;
        for (Phone each : phones) {
            if(each instanceof IPhone){

                countIphone++;
            }
            if(each instanceof Nokia){
                countNokia++;
            }
            if(each instanceof Samsung){
                countSamsung++;
            }
        }
        System.out.println("Iphones: "+countIphone);
        System.out.println("Nokia: "+countNokia);
        System.out.println("Samsung: "+countSamsung);
        System.out.println("--------------------");

        for (Phone each : phones) {
            if(each instanceof IPhone||each instanceof Samsung){
                if(each.getPrice()>=700)
                System.out.println(each.getModel()+" - the price is more than $700");
            }
        }

    }
}
/*
1. print the model, color and price of each phone object in the following format
    				model - color - price

	2. How many Iphones in the array of phones?

	3. How many Samsung in the array of phones?

	4. Display the models of Iphones and samsung that has the price of 700 or greater

 */