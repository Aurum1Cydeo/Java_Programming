package day24_dateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person [] people={new Person(),new Person(),new Person(),new Person(),new Person()};

        people[0].setInfo("Qadir",'M', LocalDate.of(1987,8,12));
        people[1].setInfo("Dilara",'F',LocalDate.of(1978,5,12));
        people[2].setInfo("Mike",'M',LocalDate.of(1958,11,3));
        people[3].setInfo("Jacky",'F', LocalDate.of(1945,7,13));
        people[4].setInfo("Mohammad",'M',LocalDate.of(1982,9,26));

        ArrayList<Person> studentsList= new ArrayList<>();
        studentsList.addAll(Arrays.asList(people));
        for (Person person : studentsList) {
            System.out.println("Name: "+person.name+", DOB: "+person.dateOfBirth+", age: "+ person.age);
        }
        System.out.println("________________people under age 55_____________________");
        studentsList.removeIf(p->p.age>55);
        for (Person person : studentsList) {
            System.out.println("Name: "+person.name+", age: "+person.age);
        }

        // print name & date of birth of each person object  names.removeIf(each->each.endsWith("J"));


        // remove all the person object that has the age > 55




    }
}
