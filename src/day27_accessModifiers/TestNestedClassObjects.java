package day27_accessModifiers;

public class TestNestedClassObjects {
    public static void main(String[] args) {


         Car obj1=new Car();// Car object
         obj1.new CarEngine();//CarEngine object
        System.out.println(obj1);
        Car.CarEngine obj2 = obj1.new CarEngine(); // CarEngine object

        new Car.StaticInnerClass();
    Car.StaticInnerClass obj3=new Car.StaticInnerClass();



    }
}
