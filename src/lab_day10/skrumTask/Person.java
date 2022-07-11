package lab_day10.skrumTask;

public class Person {

    private String name;

    private int age;
   private final char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        if(!(gender=='M'||gender=='F')){
            System.err.println("Invalid gender: "+gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null){
            System.err.println("Name can not be null ");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0){
            System.err.println("Age can not be zero or negative: "+age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void eat(String food){
        System.out.println(name+" is eating "+food);

    }
    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }
    public void sleep(){

    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
Create a class named Person:
			Variables:
				name, age , gender(final)
			Encapsulate all the fields
				Conditions:
					1. age can not be zero or negative
					2. gender can only be set to 'M' or 'F'
					3. name can not be null
			methods:
				eat(), drink(), sleep(), toString()
 */