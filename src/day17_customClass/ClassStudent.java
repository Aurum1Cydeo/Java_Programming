package day17_customClass;

public class ClassStudent {
    public String name;
    public int age;
    public String regNo;

    public void setInfo(String name, int age, String regNo) {
        this.name = name;
        this.age = age;
        this.regNo = regNo;
    }

    public String toString() {
        return "ClassStudents{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", regNo='" + regNo + '\'' +
                '}';
    }
    public void isStudent(){
        System.out.println(name+" is current student");
    }
}
