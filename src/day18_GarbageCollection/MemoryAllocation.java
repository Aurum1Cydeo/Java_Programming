package day18_GarbageCollection;

class Car{
    public String brand;
    public String model;
    public String color;
    public int year;
}



public class MemoryAllocation {
    public static void main(String[] args) {


       int a=100;//local variable located in stack memory

        Car car = new Car();
        //stack   heap
    }

    public static void method1(){
        int b =200;//local variable in stack memory
    }
    public static void method2(){
        String c="Hello world";//String object located in heap but <c> is located in stack
     //   stack    String pool memory

        String d = new String ("Hello world");

    }
}
