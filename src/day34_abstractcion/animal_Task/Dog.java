package day34_abstractcion.animal_Task;

public class Dog extends Animal implements Playable{
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void play() {
        System.out.println("Dog "+getBreed()+" "+getName()+" is playing");
    }

    @Override
    public void eat() {
        System.out.println("Dog "+getName()+" is eating dog's food");


    }
}
