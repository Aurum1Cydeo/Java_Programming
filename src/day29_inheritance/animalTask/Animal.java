package day29_inheritance.animalTask;

public class Animal {
    private String name, breed,size;
    private char gender;
    private int age;
    private String color;

    public static boolean isAnimal;
    static {
        isAnimal=true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setInfo(String name, String breed, char gender, String size, int age, String color) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setSize(size);
        setColor(color);
    }


    public void eat(){
        System.out.println(name+" is eating");
    }
    public void drink(){
        System.out.println(name+" is drinking");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size=" + size +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
