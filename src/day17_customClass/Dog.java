package day17_customClass;

public class Dog {

    public String name; //instance variable
    public String breed;
    public String size;
    public int age;
    public String color;
    public char gender;
    public Object setInfo;

    //"Max",        "Husky",     'M',        4,       "small",   "White"
    public void setInfo(String name,String breed,char gender,int age,String size,String color){
        this.name = name;//this keyword is used for calling the instance variable name
        this.breed = breed;
        this.gender= gender;
        this.age=age;
        this.size=size;
        this.color=color;
    }//this method can help us to set all the information of the dog at once

    public void eat(){
        System.out.println(name + " is eating");

    }

    public void drink(){
        System.out.println(name + " is drinking water");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                '}';
    }
}
