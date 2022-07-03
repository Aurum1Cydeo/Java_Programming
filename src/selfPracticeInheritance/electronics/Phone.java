package selfPracticeInheritance.electronics;

public class Phone extends Device {

    public Phone(String brand, String model, String color, String size, double price) {
        super(brand, model, color, size, price, true,true);
    }

    protected void call(){
        System.out.println(getBrand()+" phone is calling");
    }
    protected void text(){
        System.out.println(getBrand()+" phone is texting");
    }
}
   /* Create The following sub classes of Devica

        1. Phone
        Extra methods:
        call(), text()

        2. TV
        Extra methods:
        channelUp()
        channelDown()

        3. Computer
        Add any extra variables/methods if needed*/
