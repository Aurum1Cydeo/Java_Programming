package day28_Encapsulation.personTask;

public class TestPerson {
    public static void main(String[] args) {
        Person person1=new Person("Mohammad");
        Person person2=new Person("Abidulah",'M');
        Person person3=new Person("Hasan",28);
        Person person4=new Person("Danile","English");
        Person person5=new Person("Tatiana",31,'F');
        Person person6=new Person("Lucy",34,'F',"English");
        person4.name="James";//call instance variable through object(person4 is an object name)

        Person.planet="Mars";//call static variable through class name


        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);


        Person.printPlanetName();
        person1.eat("Baklava");
        person2.drink("Water");
        person5.drink("Tea");
        person6.drink("Coffee");



    }
}
