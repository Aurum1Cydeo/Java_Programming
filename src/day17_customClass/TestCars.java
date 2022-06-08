package day17_customClass;

public class TestCars {
    public static void main(String[] args) {

       Car car1=new Car();
       car1.setInfo("Ford","Focus",2018,"Sedan","Grey",87000,9800);


       Car car2=new Car();
       car2.setInfo("Dodge","Durango",2018,"SUV","White",56000,21000);

       Car car3=new Car();
       car3.setInfo("Toyota","FG Cruiser",2020,"SUV","VooDoo Blue",82000,19000);


        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        car2.availability();


    }
}
