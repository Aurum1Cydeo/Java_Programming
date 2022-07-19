package day34_abstraction.carTask;

public class CarTestObjects {
    public static void main(String[] args) {

        Honda honda =new Honda("Accord","Black",2019,25000);
        Audi audi=new Audi("Q6","Silver",2020,36000);
        Tesla tesla=new Tesla("Model Y","Blue",2022,60000);
        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("----------------------------");
        honda.stop();
        audi.stop();
        tesla.stop();

        System.out.println("----------------------------");

        honda.start();
        audi.start();
        tesla.start();

        System.out.println("----------------------------");

       audi.autoPark();
       tesla.autoPilot();

    }
}