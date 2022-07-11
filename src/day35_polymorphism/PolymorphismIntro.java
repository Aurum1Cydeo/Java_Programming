package day35_polymorphism;

import day34_abstractcion.animal_Task.*;


public class PolymorphismIntro {
    public static void main(String[] args) {
        Dog dog = new Dog("Max", "Husky", 'M', 4, "Small", "White");
        Cat cat = new Cat("Max", "Husky", 'M', 4, "Small", "White");
        Tiger tiger = new Tiger("Sherhan", "Urmunskiy", 'M', 2, "Large", "Orange");
        Eagle eagle = new Eagle("Eagle", "Safari", 'M', 5, "Large", "Grey");
        Lion lion = new Lion("Leon", "Wild", 'F', 20, "Large", "Yellow");
        Parrot parrot = null;
        Shark shark = null;
        Dolphin dolphin = null;
        Duck duck = null;
        Animal[] animals = {dog, cat, tiger, lion, eagle, parrot, dolphin, shark, duck};

        System.out.println("--------------------------------");




    }
}
