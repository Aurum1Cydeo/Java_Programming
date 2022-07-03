package selfPracticeInheritance.electronics;



public class MyDevices {
    public static void main(String[] args) {

        IPhone iphone1= new IPhone("Iphone13","White","Super large",1500,true,false);
        System.out.println(iphone1);
        iphone1.turnOff();
        iphone1.call();

        Samsung samsung1=new Samsung("Samsung 11","super Plus ","Black",1400,true);
        System.out.println(samsung1);
        System.out.println( samsung1.getHasSamsungPass());
        samsung1.text();

        SmartTv smartTv1=new SmartTv("LG","72lgfrt","White","Large",2100,true);
        System.out.println(smartTv1);
       smartTv1.turnOff();

        Laptop myLaptop=new Laptop("Mac","A1466","Silver","Medium",2800,true,true);
        System.out.println(myLaptop);
        System.out.println(myLaptop.isCarryOn());


        System.out.println(myLaptop.equals(smartTv1));//
    }
}
