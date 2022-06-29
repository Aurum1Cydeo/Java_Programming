package day29_inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog1=new Dog ();
        dog1.setInfo("Max","Husky",'M',"Large",4,"White");
        System.out.println(dog1);

        Cat cat1=new Cat();
        cat1.setInfo("Lea","stray",'F',"medium",3,"grey");
        System.out.println(cat1);
        cat1.eat();
        cat1.drink();
        cat1.meow();


        Tiger tiger1=new Tiger();
        tiger1.setInfo("SherKhan","Bengal",'M',"Large",6,"Orange");
        System.out.println(tiger1);

        tiger1.eat();
        tiger1.drink();
        tiger1.sleep();
        tiger1.hunt();


        System.out.println(dog1.getName());
        System.out.println(dog1.getColor());

        dog1.setGender('F');
        dog1.setAge(8);

        System.out.println(dog1);


    }
}
