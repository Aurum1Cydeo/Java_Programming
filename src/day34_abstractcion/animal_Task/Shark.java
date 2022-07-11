package day34_abstractcion.animal_Task;

public class Shark extends Animal implements WildAnimal,SwimAble {
    public Shark(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Shark "+getName()+" is eating a turtle");
    }

    @Override
    public void hunt() {
        System.out.println();
    }

    @Override
    public void swim() {

    }
}
