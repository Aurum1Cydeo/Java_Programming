package day27_accessModifiers;

public class CydeoStudents {
    public String name;
    public int age;
    public char gender;

    public static String schoolName;
    public static String secretCode;

    public CydeoStudents(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    static {
        schoolName="Cydeo School";
        secretCode="Wooden Spoon";
    }

    public String toString() {
        return "CydeoStudents{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", school=" + schoolName +
                '}';
    }
}
