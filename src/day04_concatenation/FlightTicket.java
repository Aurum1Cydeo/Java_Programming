package day04_concatenation;

public class FlightTicket {
    public static void main(String[] args) {

        //1. Create a class named FlightTicket.java
        // 2. Declare the following variables:
        //1. from
        //2. to
        //3. ticketPrice
        //3. Use concatenation to print the full ticket information Ex:
        //From Las Vegas to McLean is $425.5

        String from = "Las Vegas";
        String to = "McLean";
        float ticketPrice = 425.5f;
        System.out.println("From " + from + " to " + to + " is $" +  ticketPrice);

    }
}
