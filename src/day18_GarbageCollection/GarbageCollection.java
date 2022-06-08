package day18_GarbageCollection;


import day17_customClass.Dog;

public class GarbageCollection {
    public static void main(String[] args) {

        String s1="Java";
        s1 = null;//"Java" will be eligible for garbage collection
        System.out.println(s1);//null

        System.out.println("-----------------------------------------------------");

        String str1="Python";
        str1="Cydeo";

        System.out.println(str1);

        System.out.println("---------------------------------------");
        Dog dog1 =new Dog();
        dog1.setInfo("Lucky","chow chow",'F',2,"small","white");





    }

}
