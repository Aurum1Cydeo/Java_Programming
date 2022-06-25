package day24_dateAndTime;

import java.time.LocalDate;

public class Person {
    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;

    public void setInfo(String name, char gender, LocalDate dateOfBirth) {
        this.name = name;
       age = LocalDate.now().getYear()-dateOfBirth.getYear();
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
