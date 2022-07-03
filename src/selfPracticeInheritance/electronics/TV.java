package selfPracticeInheritance.electronics;

public class TV extends Device{


    public TV(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    protected void channelUp(){
        System.out.println(getBrand()+" channel is up");

    }
    protected void channelDown(){
        System.out.println(getBrand()+" channel is down");

    }
    /*
     2. TV
        Extra methods:
        channelUp()
        channelDown()
     */
}
