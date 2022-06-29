package day28_Encapsulation.Encapsulation;

import java.time.LocalDate;

public class Person {
    private String name;
    private int age;
    private char gender;
    private LocalDate dateOfBirth;

    public Person(String name, int age, char gender, LocalDate dateOfBirth) {
        setName(name);
        setAge(age);
        setGender(gender);
        setDateOfBirth(dateOfBirth);
    }

    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public String getName() {
        if (name == null || name.isBlank() || name.isEmpty()) {

            return "Unknown";
        }
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            System.out.println("Name can not be Blank, Empty, or Null");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 120 || age < 0) {
            System.out.println("Age can not be 0 or 120");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            System.out.println("Gender is not valid");
            System.exit(1);
        }
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if (dateOfBirth.isAfter(LocalDate.now())) {
            System.out.println("DOB can not be after today's day");
            System.exit(1);
        }
        this.dateOfBirth = dateOfBirth;
    }

    /*
    Variables:
    name, age, gender, dateOfBirth
        name:
            Write: can not be null/empty/blank
            Read: if name is not, return "Unknown" instead
        age:
            Write: age can not be less than zero or greater than 120
        gender:
            Write: gender can only be 'M' or 'F'
        dateOfBirth:
            Write:  can not be after today's date
    Add a constructor that can set all the fields
    Add toString()
     */
}
