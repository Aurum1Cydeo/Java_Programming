package day34_abstraction.animal_Task;

public class Dolphin extends Animal implements SwimAble{
    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dolphin "+getName()+" is eating fish");
    }

    @Override
    public void swim() {

    }
}
