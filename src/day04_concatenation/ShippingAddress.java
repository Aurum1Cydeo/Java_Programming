package day04_concatenation;

import javax.sound.midi.Soundbank;

public class ShippingAddress {
    public static void main(String[] args) {
        /*1. Create ac lass named ShippingAddress.java
        2. Declare the following variables:
1. name
2. buildingNumber 3. streetName
4. city
5. state
6. zipCode
3. Use concatenation to print the full shipping address Ex:
Your Shipping address is:
Aaron Kissinger 13621A Legacy Circle Fairfax, VA 22030

         */
        String name = "Aaron",
        lastName = "Kissinger";
        String buildingNumber = "13621A";
        String streetName = "Legacy Circle";
        String city = "Fairfax";
        String state = "Va";
        String zipCode = "20121";

        System.out.println("Your Shipping address is :");
        System.out.println("\t" + name + " " + lastName);
        System.out.println("\t" + buildingNumber + " " + streetName );
        System.out.println("\t" + city + ", " + state +" " + zipCode);

        System.out.println("------------------------------------------");

        System.out.println("Your Shipping address is : \n\t" +name
        + "\n\t" + buildingNumber + " " + streetName + "\n\t" + city + ", " + state + " " + zipCode);

    }

    }
