package encapsulationTask;

import java.util.ArrayList;

public class CandyTest {

    public static void main(String[] args) {

        ArrayList<Candy> candies=new ArrayList<>();

        candies.add(new Candy("Rosh",0,00,true));
        candies.add(new Candy("Airb",13,2.45,false));
        candies.add(new Candy ("Snickers",16,2.54,true));
        candies.add(new Candy ("Mix",20,4.25,true));
        candies.add(new Candy("Vitamix",15,5.6,false));
        for (Candy each : candies) {
            System.out.println("Brand: "+each.getBrand()+" price: $"+each.getPrice());
        }



    }

}
/* Create a custom class named Candy
        private variables:
            brand (String), quantity (int), price (double), hasPeanuts (boolean)

        Encapsulate All the private fields
                (price of candy can not be set to negative)
                (quantity of candy can not be set to zero or negative)

        Add a constructor that allows user to set all the fields when the object is created.
                (If the arguments not valid it should not be set to the instances)

        Extra methods:
            toString():
                if the price is zero, print "free" instead of 0

        5.1 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy

 */