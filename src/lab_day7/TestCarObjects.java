package lab_day7;

public class TestCarObjects {
    public static void main(String[] args) {

      Car car1 =new Car();
     /* car1.brand="BMW";
      car1.year=2022;
      car1.model="X6";
      car1.color="Red";
      car1.price=50000;
*/
      car1.setInfo("BWM","X6",2022,"Red",60000);
      Car car2=new Car();

/*
      car2.brand="Audi";
        car2.model="Q4";
        car2.color="Black";
        car2.year=2021;
        car2.price=45000;
*/
      car2.setInfo("Audi","Q4",2021,"Blue",56000);
      Car car3=new Car();
      car3.setInfo("Lexus","GS350",2020,"White",50000);

      System.out.println(car1);
      System.out.println(car2);
      System.out.println(car3);

      car1.drive();

      Car car4=new Car();
     // car4=null; make it qualify for garbage collection
      car4=new Car();//reassign to another object
    }
}
