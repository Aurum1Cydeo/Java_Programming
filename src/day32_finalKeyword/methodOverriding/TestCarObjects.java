package day32_finalKeyword.methodOverriding;

public class TestCarObjects {
    public static void main(String[] args) {


        Toyota toyota=new Toyota("Camry","Blue",2020,25000);
        Honda accord=new Honda("Accord","Grey",2019,24000);
        Audi audi=new Audi("06","Silver",2021,50000);
        BMW bmw=new BMW("X6","Black",2017,45000);
        Tesla tesla=new Tesla("Model 3","White",2022,65000);
        System.out.println(toyota);
        System.out.println(accord);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(tesla);

        System.out.println("---------------------------");

        toyota.start();
        accord.start();
        audi.start();
        tesla.start();
        bmw.start();







    }
}
