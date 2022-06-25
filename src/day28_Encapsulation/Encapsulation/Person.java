package day28_Encapsulation.Encapsulation;

import java.time.LocalDate;

public class Person {
    private String name;
    private int age;
    private char gender;
    private LocalDate dateOfBirth;

    public String getName() {
        if(name==null){
           return"Unknown";
        }
        return name;
    }

    public void setName(String name) {
       if( name.isBlank()||name.isEmpty()){
           System.err.println("Name can not be empty or blank");
           System.exit(1);
       }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /*
    name,age ,gender,dateOfBirth
     */
}
