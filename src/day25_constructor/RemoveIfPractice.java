package day25_constructor;

import day17_customClass.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfPractice {
    public static void main(String[] args) {



        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

        ArrayList<Dog> smallDogs=new ArrayList<>(Arrays.asList(dogs));
        for (Dog dog : dogs) {
            if(dog.size.equalsIgnoreCase("Small")){
                smallDogs.add(dog);
            }
        }

        smallDogs.removeIf(p-> !p.size.equalsIgnoreCase("Small"));
        System.out.println(smallDogs);

        ArrayList<Dog> youngDogs=new ArrayList<>(Arrays.asList(dogs));

        youngDogs.removeIf(p->p.age>4);

       /* for (Dog dog : dogs) {
            if(dog.age<=4){
               youngDogs.add(dog);
            }}
       */
        System.out.println("----------------------------");
        System.out.println(youngDogs);
       // youngDogs.forEach(p-> System.out.println(p.name));
        ArrayList<Dog> femaleDogs=new ArrayList<>(Arrays.asList(dogs));
        femaleDogs.removeIf(p->p.gender=='M');//remove all maledogs to have only femaleDogs in the list

        ArrayList<Dog> maleDogs=new ArrayList<>(Arrays.asList(dogs));
        maleDogs.removeIf(p->p.gender=='F');

        System.out.println("---------------------------------------------");

        Dog[] dogs2 = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs2[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs2[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs2[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs2[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs2[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs2[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

       ArrayList<Dog> list= new ArrayList<>(Arrays.asList(dogs2));

       list.removeIf(p-> p.size.equalsIgnoreCase("Small")) ;
        dogs2=list.toArray(new Dog[0]);


        System.out.println(Arrays.asList(dogs2));


    }

}
