package day26_statics;

public class ConstructorCalls {


    public ConstructorCalls(){
        System.out.println("Default constructor");
    }


    public ConstructorCalls(int a){
        this();//constructor call has to be at the first place/step
        System.out.println(" Constructor with int argument");
    }


    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument");

    }

    public ConstructorCalls(String c){
        this(2.5);
       // this(); only one constructor in one constructor
        System.out.println("Constructor with String argument");
    }


    public static void main(String[] args) {
        method1();
        System.out.println("-----------------------------");
        method2();
    }
    public static void method1(){
        System.out.println("Method1 ");
    }

    public static void method2(){
        method1();
        System.out.println("Method2");
    }


}
