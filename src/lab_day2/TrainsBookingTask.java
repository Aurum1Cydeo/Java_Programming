package lab_day2;

import java.util.Scanner;

public class TrainsBookingTask {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);// if u want to use any property belongs to class,
        // need to create object

        System.out.println("Do you have a bag (Yes: true,NO:false");
        Boolean hasBags = input.nextBoolean();

        System.out.println("Direct transport only (Yes:true,NO:false");
        boolean nonStop = input.nextBoolean();

        System.out.println("Choose your travel type(train, bus, flight");
        int transportType=input.nextInt();

        System.out.println("From: ");
        String from = input.next();

        System.out.println("To: ");
        String destination= input.next();


        String train1 = "TR001";
        String train2 = "TR002";
        String train3 = "TR003";
        String train4 = "TR004";
        String bus1 = "BUS001";
        String bus2 = "BUS002";
        String bus3 = "BUS003";
        String flight1 = "FL001";
        String flight2 = "FL002";
        String flight3 = "FL003";

        if(!(from.equalsIgnoreCase("Berlin")&& destination.equalsIgnoreCase("Amsterdam"))){
            System.out.println("For now, we can only serve you Berlin-Amsterdam transportation.Please change your destination");
       return;//stop JVM
        }

        switch (transportType){
            case 1://train
                if (nonStop && hasBags) {
                    System.out.println("You can take "+train3);
                    return;//stop the code
                }else if(!nonStop&&hasBags){
                    System.out.println("You can take " + train4);
                    return;
                }else if (nonStop && !hasBags){//verbal code
                    System.out.println("You can take " + train1);
                    return;
                }else{
                    System.out.println("You can take "+ train1+train2+train3+train4);
                }
                break;
            case 2://bus
                System.out.println("YOu can take "+bus1+bus2+bus3);
                break;
            case 3://flight
                if (nonStop && hasBags){
                    System.out.println("Could not find any flight for you - please check your filters and retry it");
                    return;
                }else if(!nonStop&&hasBags){
                    System.out.println("You can take " + flight1);
                    return;
                }else if(nonStop&&!hasBags){
                    System.out.println(" You can take "+ flight1+flight2+flight3);
                }
                break;
            default://there is no other transportation type
                System.out.println("Invalid type");
        }










    }
}
