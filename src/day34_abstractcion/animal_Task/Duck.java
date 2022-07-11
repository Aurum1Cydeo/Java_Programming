package day34_abstractcion.animal_Task;

public class Duck extends Animal implements Flyable, SwimAble{
    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Duck "+getName()+" is eating worms");
    }

    @Override
    public void fly() {
        System.out.println("Duck by name "+getName()+" likes to fly");
    }

    @Override
    public void swim() {
        System.out.println("Duck by name "+getName()+" is swimming");
    }
}
